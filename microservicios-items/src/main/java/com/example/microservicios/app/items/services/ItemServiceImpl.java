package com.example.microservicios.app.items.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.microservicios.app.items.entity.Item;
import com.example.microservicios.app.items.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	public ItemRepository repository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Item> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	@Transactional
	public Item save(Item item) {
		// TODO Auto-generated method stub
		calcularTotal(item);
		return repository.save(item);
	}
	
	public void calcularTotal(Item item) {
		
		Long precio = item.getPrecio();
		Long cantidad = item.getCantidad();
		Long total = precio*cantidad;
		item.setTotal(total);
		
	}

}
