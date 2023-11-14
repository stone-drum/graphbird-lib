package de.graphbird.lib.model.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.graphbird.lib.model.task.Task;

@Repository
public interface AufgabeRepository extends CrudRepository<Task, Long> {
	public Page<Task> findAll(Pageable pageable);
	public Page<Task> findAll(Specification<Task> spec, Pageable pageable);
	public Optional<Task> findByVorgangId(Long vorgangId);
}