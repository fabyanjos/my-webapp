package com.fabyanjos.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabyanjos.app.model.Item;
import com.fabyanjos.app.repositories.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	public List<Item> getAllItens() {
		return this.itemRepository.getAllItens();
	}

	public Integer createItem(Item item) {
		return this.itemRepository.createItem(item);
	}
}
