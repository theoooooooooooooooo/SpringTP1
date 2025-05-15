package com.example.demo.Repository;

import com.example.demo.Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "utilisateur")
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {
}