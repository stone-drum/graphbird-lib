package de.graphbird.lib.model.information.shared;

import java.time.ZonedDateTime;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(schema = "graphbird")
public class Comment {
	private String message;
	private String userName;
	private ZonedDateTime timestamp;
}
