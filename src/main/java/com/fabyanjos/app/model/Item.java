package com.fabyanjos.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Item implements Serializable {

	private static final long serialVersionUID = 8317386834226802814L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private Double value;
	private Long qty;
	private Double realValue;

    public Item() {
    }

    public Item(Integer id, String name, Double value) {
		this.id = id;
		this.name = name;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", value=" + value + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Long getQty() {
		return qty;
	}

	public void setQty(Long qty) {
		this.qty = qty;
	}

	public Double getRealValue() {
		return realValue;
	}

	public void setRealValue(Double realValue) {
		this.realValue = realValue;
	}
}
