package com.fabyanjos.app.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fabyanjos.app.model.Item;

@Repository
@Transactional
public class ItemRepository {

	@Autowired
	private SessionFactory factory;

	@SuppressWarnings("unchecked")
	public List<Item> getAllItens() {
		return this.factory.getCurrentSession().createCriteria(Item.class).list();
	}

	public Integer createItem(Item item) {
		Item mergeItem = (Item) this.factory.getCurrentSession().save(item);
		return mergeItem.getId();
	}

}
