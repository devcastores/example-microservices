package com.example.microservicios.app.items.services;

import com.example.microservicios.app.items.entity.Item;

public interface ItemService {
	
	public Iterable<Item> findAll();
	
	public Item save(Item item);
}
