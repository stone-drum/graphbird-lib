package de.graphbird.lib.model.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.graphbird.lib.model.poi.Poi;

@Repository
public interface PoiRepository extends CrudRepository<Poi, Long> {
	public Page<Poi> findAll(Pageable pageable);
	public Page<Poi> findAll(Specification<Poi> spec, Pageable pageable);
}