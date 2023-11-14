package de.graphbird.lib.model.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.graphbird.lib.model.information.TextInformation;

@Repository
public interface TextInformationRepository extends CrudRepository<TextInformation, Long> {
	public Page<TextInformation> findAll(Pageable pageable);
	public Page<TextInformation> findAll(Specification<TextInformation> spec, Pageable pageable);
}
