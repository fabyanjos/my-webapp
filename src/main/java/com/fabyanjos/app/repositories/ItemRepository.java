package com.fabyanjos.app.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fabyanjos.app.model.Item;

@Repository

public class ItemRepository {

	@Autowired
	private SessionFactory factory;

	@SuppressWarnings("unchecked")
	public List<Item> getAllItens() {
		return this.factory.openSession().createCriteria(Item.class).list();
	}

    @Transactional
	public Integer createItem(Item item) {
		this.factory.getCurrentSession().save(item);
		return item.getId();
	}

}
