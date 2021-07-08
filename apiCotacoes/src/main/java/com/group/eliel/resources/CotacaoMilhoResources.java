package com.group.eliel.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group.eliel.domain.CotacaoMilho;
import com.group.eliel.repository.CotacaoMilhoRepository;

@RestController
@RequestMapping("api/v1/milho")
public class CotacaoMilhoResources {

	private List<CotacaoMilho> cotacaoMilho = new ArrayList<>();
	
	@Autowired
	private CotacaoMilhoRepository milhoRepo;
	
	@PostMapping
	public ResponseEntity<CotacaoMilho> salvarMilho(@RequestBody CotacaoMilho cotMilho) {

		return ResponseEntity.
				status(HttpStatus.OK).
				body( this.milhoRepo.save(cotMilho) );
	}
	
	@GetMapping
	public List<CotacaoMilho> list() {
		return this.milhoRepo.findAll();
	}
	
	
}
