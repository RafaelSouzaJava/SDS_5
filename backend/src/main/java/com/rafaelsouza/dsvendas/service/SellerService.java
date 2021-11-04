package com.rafaelsouza.dsvendas.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelsouza.dsvendas.domain.Seller;
import com.rafaelsouza.dsvendas.dto.SellerDTO;
import com.rafaelsouza.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public Seller find(Long id) {
		Optional<Seller> seller = sellerRepository.findById(id);
		return seller.orElseThrow();
	}
	
	public List<SellerDTO> findAll() {
		List<Seller> seller = sellerRepository.findAll();
		List<SellerDTO> sellerDto = seller.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
		return sellerDto;
	}

}
