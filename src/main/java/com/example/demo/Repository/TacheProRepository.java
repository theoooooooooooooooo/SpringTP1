package com.example.demo.Repository;

import com.example.demo.Model.TachePro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "tachePro")
public interface TacheProRepository extends CrudRepository<TachePro, Long> {
}