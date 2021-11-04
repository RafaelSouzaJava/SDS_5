package com.rafaelsouza.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafaelsouza.dsvendas.domain.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{

}
