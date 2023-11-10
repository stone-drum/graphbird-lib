package de.graphbird.lib.model.information.shared;

import java.time.ZonedDateTime;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Embeddable
@Data
@Builder
@Table(schema = "graphbird")
public class Revision {
	//private User user;
	private ZonedDateTime date;
	private String comment;
	//private List<Long> approvedByUserIds;
}
