package com.rafaelsouza.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafaelsouza.dsvendas.domain.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long>{

}
