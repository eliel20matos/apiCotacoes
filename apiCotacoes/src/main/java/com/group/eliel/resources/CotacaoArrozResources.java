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

import com.group.eliel.domain.CotacaoArroz;
import com.group.eliel.repository.CotacaoArrozRepository;

@RestController
@RequestMapping("api/v1/arroz")
public class CotacaoArrozResources {
	
	private List<CotacaoArroz> cotacaoArroz = new ArrayList<>();
	
	@Autowired
	private CotacaoArrozRepository arrozRepo;
	
	@PostMapping
	public ResponseEntity<CotacaoArroz> salvarArroz(@RequestBody CotacaoArroz cotArroz) {

		return ResponseEntity.
				status(HttpStatus.OK).
				body( this.arrozRepo.save(cotArroz) );
	}
	
	@GetMapping
	public List<CotacaoArroz> list() {
		return this.arrozRepo.findAll();
	}
	
	
}
