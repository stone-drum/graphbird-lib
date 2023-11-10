package de.graphbird.lib.model.task;

import java.io.Serializable;
import java.time.ZonedDateTime;

import de.graphbird.lib.model.common.Status;
import de.graphbird.lib.model.mission.Mission;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="aufgaben", schema="graphbird")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String title;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="vorgang_id")
	private Mission vorgang;
	
	@Column
	private ZonedDateTime frist;
	
	@Column
	private Status status;
}
