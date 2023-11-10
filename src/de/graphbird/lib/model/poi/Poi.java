package de.graphbird.lib.model.poi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.graphbird.lib.model.geo.Coordinate;
import de.graphbird.lib.osm.enums.OsmKeyValueMap;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="pois", schema="graphbird")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Poi {
	
	private static final Logger logger = LoggerFactory.getLogger(Poi.class);
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String title;
	
	@Embedded
	private Coordinate coordinate;
	
	@Column
	private String osmKey;
	
	@Column
	private String osmValue;
	
	@Column
	private PoiType type;
	
	public String getImage() {
		return OsmKeyValueMap.getInstance().getImage(this.osmKey, this.osmValue);
	}
	
	public static PoiType poiTypeFromGeoJsonType(String osmKey, String osmValue) {
		String typeStr = osmKey.replace("-", "_").toUpperCase() + "_" + osmValue.replace("-", "_").toUpperCase();
		PoiType result = PoiType.UNKNOWN;
		try {
			result = PoiType.valueOf(typeStr);
		} catch(IllegalArgumentException e) {
			logger.warn("Unknown poi type: " + typeStr);
		}
		return result;
	}
	
}
