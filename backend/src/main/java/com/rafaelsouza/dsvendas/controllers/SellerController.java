package com.rafaelsouza.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelsouza.dsvendas.dto.SellerDTO;
import com.rafaelsouza.dsvendas.service.SellerService;

@RestController
@RequestMapping(value =	"sellers")
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll() {
		List<SellerDTO> sellerDto = sellerService.findAll();
		return ResponseEntity.ok(sellerDto);
	}

}
