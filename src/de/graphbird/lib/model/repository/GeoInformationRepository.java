package de.graphbird.lib.model.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.graphbird.lib.model.information.GeoInformation;

@Repository
public interface GeoInformationRepository extends CrudRepository<GeoInformation, Long> {
	public Page<GeoInformation> findAll(Pageable pageable);
	public Page<GeoInformation> findAll(Specification<GeoInformation> spec, Pageable pageable);
}
