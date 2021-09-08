package com.example.microservicios.app.items.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservicios.app.items.entity.Item;
import com.example.microservicios.app.items.services.ItemService;

@RestController
public class ItemController {

	@Autowired
	public ItemService service;
	
	@GetMapping
	public ResponseEntity<?> findAll(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@PostMapping
	public ResponseEntity<?> crear(@RequestBody Item item){
		Item itemDB = service.save(item);
		return ResponseEntity.status(HttpStatus.CREATED).body(itemDB);
	}
	
}
