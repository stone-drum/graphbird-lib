package de.graphbird.lib.model.geojson;

import java.util.Iterator;
import java.util.List;

import lombok.Data;

@Data
public class FeatureCollection implements Iterable<Feature> {
	
	private List<Feature> features;
	private String type;

	@Override
	public Iterator<Feature> iterator() {
		return features.iterator();
	}
}
