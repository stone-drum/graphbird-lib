package de.graphbird.lib.model.route;

import java.util.List;

import de.graphbird.lib.model.geo.Coordinate;
import lombok.Data;

@Data
public class Route {

	private List<Coordinate> coordinates;
}
