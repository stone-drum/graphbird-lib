package de.graphbird.lib.model.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.graphbird.lib.model.user.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	public Page<User> findAll(Pageable pageable);
	public Page<User> findAll(Specification<User> spec, Pageable pageable);
}
