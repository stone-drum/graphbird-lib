package de.graphbird.lib.model.information;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import de.graphbird.lib.model.file.FileInformation;
import de.graphbird.lib.model.geo.Coordinate;
import de.graphbird.lib.model.information.shared.NamedEntity;
import de.graphbird.lib.model.information.shared.Topic;
import de.graphbird.lib.model.user.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "graphbird")
@EqualsAndHashCode(callSuper = true)
public class TextInformation extends Information {

	@Lob
	private String text;
	
	@Lob
	private String englishText;
	
	@Column
	private String language;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	private List<Topic> topics;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	private List<NamedEntity> entities;
	
	@Lob
	private List<String> tables;
	
	@Builder
	public TextInformation(FileInformation file, User creator, String name, String description,
			ZonedDateTime creationDate, ZonedDateTime expirationDate, boolean expires,
			String thumbnail, List<Coordinate> coordinates, List<String> tags,
			List<Long> accessGroups, List<Long> accessUsers, String text,
			String englishText, String language, List<Topic> topics, List<NamedEntity> entities) {
		super(file, creator, name, description, InformationType.TEXT, creationDate,
				expirationDate, expires, thumbnail, coordinates, tags, accessGroups, accessUsers);
		this.text = text;
		this.englishText = englishText;
		this.language = language;
		this.topics = topics != null ? new ArrayList<>(topics) : new ArrayList<>();
		this.entities = entities != null ? new ArrayList<>(entities) : new ArrayList<>();
	}
}
