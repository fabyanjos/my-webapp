package com.fabyanjos.app.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ListItem {
	
	private List<Item> item;
	
	public ListItem() {
	}
	
	public ListItem(List<Item> itens) {
		this.item = itens;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}
}
