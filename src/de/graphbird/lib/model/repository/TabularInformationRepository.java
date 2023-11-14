package de.graphbird.lib.model.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.graphbird.lib.model.information.TabularInformation;

@Repository
public interface TabularInformationRepository extends CrudRepository<TabularInformation, Long> {
	public Page<TabularInformation> findAll(Pageable pageable);
	public Page<TabularInformation> findAll(Specification<TabularInformation> spec, Pageable pageable);
}