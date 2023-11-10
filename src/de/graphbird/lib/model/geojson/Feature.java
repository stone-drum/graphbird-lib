package de.graphbird.lib.model.geojson;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
public class Feature {

	@JsonInclude(JsonInclude.Include.ALWAYS)
	private Map<String, Object> properties;

	private String type;

	private Geometry geometry;
}
