package de.graphbird.lib.model.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.graphbird.lib.model.information.AudioInformation;

@Repository
public interface AudioInformationRepository extends CrudRepository<AudioInformation, Long> {
	public Page<AudioInformation> findAll(Pageable pageable);
	public Page<AudioInformation> findAll(Specification<AudioInformation> spec, Pageable pageable);
}
