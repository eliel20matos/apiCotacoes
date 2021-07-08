package com.group.eliel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group.eliel.domain.CotacaoArroz;

@Repository
public interface CotacaoArrozRepository extends JpaRepository<CotacaoArroz, Long> {

}
