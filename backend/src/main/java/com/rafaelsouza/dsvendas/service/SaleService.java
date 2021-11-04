package com.rafaelsouza.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaelsouza.dsvendas.domain.Sale;
import com.rafaelsouza.dsvendas.dto.SaleDTO;
import com.rafaelsouza.dsvendas.repositories.SaleRepository;
import com.rafaelsouza.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	@Cacheable
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> sale = saleRepository.findAll(pageable);
		Page<SaleDTO> saleDto = sale.map(x -> new SaleDTO(x));
		return saleDto;
	}

}
