package com.example.demo.Repository;

import com.example.demo.Model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "tache")
public interface TacheRepository extends CrudRepository<Tache, Long> {
}