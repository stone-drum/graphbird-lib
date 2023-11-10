package de.graphbird.lib.model.information;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import de.graphbird.lib.model.information.shared.TimedSentence;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(schema = "graphbird")
@EqualsAndHashCode(callSuper = true)
public class AudioInformation extends Information {
	
	@Column
	private Long length;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<TimedSentence> transcription;
	
	public void clearTranscriptions() {
		this.transcription.clear();
	}
	
	public void addTranscriptions(List<TimedSentence> transcriptions) {
		this.transcription.addAll(transcriptions);
	}
	
	public AudioInformation() {
		this.transcription = new ArrayList<>();
	}
	
	public String getTextTranscription() {
		return transcription.stream().map(w -> w.getSentence()).collect(Collectors.joining(" "));
	}
}
