package de.graphbird.lib.model.file;

import java.time.ZonedDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(indexes = { @Index(name = "FILE_MD5_INDEX", columnList = "md5", unique = true) }, schema = "graphbird")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FileInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;

	@Column
	private String md5;

	@Column
	private ZonedDateTime creationDate;

	@Column
	private ZonedDateTime expirationDate;

	@Column
	private Long author; // user id on file system

	@Column
	private String folder;

	@Column
	private Long fileSize;

	@Column
	private String contentType;

	public String getDownloadUrl() {
		return "";
	}
}
