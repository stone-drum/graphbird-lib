package de.graphbird.lib.model.route;

import java.time.ZonedDateTime;
import java.util.List;

import de.graphbird.lib.model.geo.Coordinate;
import de.graphbird.lib.model.information.Information;
import lombok.Data;

@Data
public class Waypoint {
	private Coordinate coordinate;
	private ZonedDateTime timestamp;
	private String comment;
	private List<Information> documents;
}
