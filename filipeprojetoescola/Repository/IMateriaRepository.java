package com.filipeprojetoescola.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.filipeprojetoescola.Entity.MateriaEntity;

@Repository
public interface IMateriaRepository extends JpaRepository<MateriaEntity, Long>{
	
}
