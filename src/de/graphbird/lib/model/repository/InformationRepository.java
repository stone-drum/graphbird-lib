package de.graphbird.lib.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import de.graphbird.lib.model.information.Information;

public interface InformationRepository extends CrudRepository<Information, Long> {
	public Page<Information> findAll(Pageable pageable);
	public Page<Information> findAll(Specification<Information> spec, Pageable pageable);
	public Optional<Information> findByFileId(Long fileId);
	
	@Query("SELECT i FROM Information i JOIN i.tags t WHERE t = LOWER(:tag)")
	List<Information> retrieveByTag(@Param("tag") String tag);
}
