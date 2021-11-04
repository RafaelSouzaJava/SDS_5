package com.rafaelsouza.dsvendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelsouza.dsvendas.dto.SaleDTO;
import com.rafaelsouza.dsvendas.service.SaleService;

@RestController
@RequestMapping("sales")
public class SaleController {
	
	@Autowired
	private SaleService saleService;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> saleDTO = saleService.findAll(pageable);
		return ResponseEntity.ok(saleDTO);
	}

}