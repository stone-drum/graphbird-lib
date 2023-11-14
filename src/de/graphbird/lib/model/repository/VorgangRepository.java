package de.graphbird.lib.model.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.graphbird.lib.model.mission.Mission;

@Repository
public interface VorgangRepository extends CrudRepository<Mission, Long> {
	public Page<Mission> findAll(Pageable pageable);
	public Page<Mission> findAll(Specification<Mission> spec, Pageable pageable);
}