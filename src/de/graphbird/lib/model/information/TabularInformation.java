package de.graphbird.lib.model.information;

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
public class TabularInformation extends Information {
	private String data;
}
