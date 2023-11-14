package de.graphbird.lib.model.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.graphbird.lib.model.file.FileInformation;

@Repository
public interface FileRepository extends CrudRepository<FileInformation, Long> {
	public Page<FileInformation> findAll(Pageable pageable);
	public Page<FileInformation> findAll(Specification<FileInformation> spec, Pageable pageable);
	public Optional<FileInformation> findByMd5(String md5);
}