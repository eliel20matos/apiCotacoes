package com.group.eliel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group.eliel.domain.CotacaoMilho;

@Repository
public interface CotacaoMilhoRepository extends JpaRepository<CotacaoMilho, Long>{

}
