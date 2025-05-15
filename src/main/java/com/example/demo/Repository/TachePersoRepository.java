package com.example.demo.Repository;

import com.example.demo.Model.TachePerso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "tachePerso")
public interface TachePersoRepository extends CrudRepository<TachePerso, Long> {
}