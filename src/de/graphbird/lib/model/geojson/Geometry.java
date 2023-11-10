package de.graphbird.lib.model.geojson;

import lombok.Data;

@Data
public class Geometry {
	private String type;
	private Double[] coordinates;
}
