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
import com.group.eliel.domain.CotacaoSoja;
import com.group.eliel.repository.CotacaoSojaRepository;

@RestController
@RequestMapping("api/v1/soja")
public class CotacaoSojaResources {

	private List<CotacaoSoja> cotacaoSoja = new ArrayList<>();
	
	@Autowired
	private CotacaoSojaRepository sojaRepo;
	
	@PostMapping
	public ResponseEntity<CotacaoSoja> salvarSoja(@RequestBody CotacaoSoja cotSoja) {

		return ResponseEntity.
				status(HttpStatus.OK).
				body( this.sojaRepo.save(cotSoja) );
	}
	
	@GetMapping
	public List<CotacaoSoja> list() {
		return this.sojaRepo.findAll();
	}
	
}
