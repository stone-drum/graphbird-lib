package de.graphbird.lib.model.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.graphbird.lib.model.information.ImageInformation;

@Repository
public interface ImageInformationRepository extends CrudRepository<ImageInformation, Long> {
	public Page<ImageInformation> findAll(Pageable pageable);
	public Page<ImageInformation> findAll(Specification<ImageInformation> spec, Pageable pageable);
}
