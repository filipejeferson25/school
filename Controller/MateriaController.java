package com.filipeprojetoescola.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.filipeprojetoescola.Entity.MateriaEntity;
import com.filipeprojetoescola.Repository.IMateriaRepository;

@RestController
@RequestMapping("/materia")
public class MateriaController {

	@Autowired
	private IMateriaRepository materiaRepository;
	
	
	@GetMapping
	protected ResponseEntity<List<MateriaEntity>> listarMaterias(){
		return ResponseEntity.status(HttpStatus.OK).body(this.materiaRepository.findAll());
	}
	
	@PostMapping
	protected ResponseEntity<Boolean> cadastrarMaterias(@RequestBody MateriaEntity materia){
		try{
			this.materiaRepository.save(materia);
			return ResponseEntity.status(HttpStatus.OK).body(true);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.OK).body(false);
		}
	}
}
