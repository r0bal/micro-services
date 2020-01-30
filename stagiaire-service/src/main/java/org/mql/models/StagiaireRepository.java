package org.mql.models;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StagiaireRepository extends JpaRepository<Stagiaire, Integer> {
	
	@Query("SELECT s FROM Stagiaire s where s.company = :id")
	public List<Stagiaire> findStagiaireByCompanyId(@Param("id") int id);
}
