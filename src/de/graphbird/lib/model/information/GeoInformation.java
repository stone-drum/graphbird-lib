package de.graphbird.lib.model.information;

import de.graphbird.lib.model.geo.Coordinate;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
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
public class GeoInformation extends Information {
	private Coordinate coordinate;
}
