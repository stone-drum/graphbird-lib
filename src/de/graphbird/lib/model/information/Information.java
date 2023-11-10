package de.graphbird.lib.model.information;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import de.graphbird.lib.model.file.FileInformation;
import de.graphbird.lib.model.geo.Coordinate;
import de.graphbird.lib.model.information.shared.Comment;
import de.graphbird.lib.model.information.shared.Revision;
import de.graphbird.lib.model.user.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@EqualsAndHashCode
@Table(schema = "graphbird", indexes = {@Index(name="fileIdx", columnList = "file_id" )})
public abstract class Information implements IInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="file_id")
	private FileInformation file;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private User creator;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column
	private InformationType type;
	
	@Column
	private ZonedDateTime creationDate;
	
	@Column
	private boolean expires;
	
	@Column
	private ZonedDateTime expirationDate;

	@Lob
	private String thumbnail;
	
	@ElementCollection
	private List<Coordinate> coordinates;
	
	@ElementCollection
	private List<String> tags;
	
	@ElementCollection
	private List<Long> accessGroups;
	
	@ElementCollection
	private List<Long> accessUsers;
	
	@ElementCollection(targetClass = Revision.class)
	private List<Revision> revisions;
	
	@ElementCollection(targetClass = Comment.class)
	private List<Comment> comments;
	
	@ElementCollection
	private List<Long> subInformationIds;
	
	@Column
	private int currentAnalyzationProgress;
	
	@Column
	private int totalAnalytizationSteps;
	
	public String addTag(String tag) {
		this.tags.add(tag);
		return tag;
	}
	
	public Comment addComment(Comment comment) {
		this.comments.add(comment);
		return comment;
	}
	
	public Information() {
		this.tags = new ArrayList<>();
		this.coordinates = new ArrayList<>();
		this.accessGroups = new ArrayList<>();
		this.accessUsers = new ArrayList<>();
		this.revisions = new ArrayList<>();
		this.subInformationIds = new ArrayList<>();
		this.comments = new ArrayList<>();
	}
	
	public Information(FileInformation file, User creator, String name, String description,
			InformationType type, ZonedDateTime creationDate, ZonedDateTime expirationDate,
			boolean expires, String thumbnail, List<Coordinate> coordinates, List<String> tags,
			List<Long> accessGroups, List<Long> accessUsers) {
		this();
		this.file = file;
		this.creator = creator;
		this.name = name;
		this.description = description;
		this.type = type;
		this.creationDate = creationDate;
		this.expirationDate = (expirationDate != null) ? expirationDate : ZonedDateTime.of(LocalDateTime.MIN, ZoneId.of("CET"));
		this.expires = expires;
		this.thumbnail = thumbnail;
		this.coordinates.addAll(coordinates);
		this.tags.addAll(tags);
		this.accessGroups.addAll(accessGroups);
		this.accessUsers.addAll(accessUsers);
	}
}
