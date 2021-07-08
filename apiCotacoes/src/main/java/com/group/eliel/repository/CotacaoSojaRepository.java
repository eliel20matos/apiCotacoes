package com.group.eliel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group.eliel.domain.CotacaoSoja;

@Repository
public interface CotacaoSojaRepository extends JpaRepository<CotacaoSoja, Long> {

}
