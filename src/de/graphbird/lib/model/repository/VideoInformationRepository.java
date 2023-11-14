package de.graphbird.lib.model.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.graphbird.lib.model.information.VideoInformation;

@Repository
public interface VideoInformationRepository extends CrudRepository<VideoInformation, Long> {
	public Page<VideoInformation> findAll(Pageable pageable);
	public Page<VideoInformation> findAll(Specification<VideoInformation> spec, Pageable pageable);
}
