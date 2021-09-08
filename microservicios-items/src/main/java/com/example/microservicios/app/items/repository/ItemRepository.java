package com.example.microservicios.app.items.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.microservicios.app.items.entity.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {

}
