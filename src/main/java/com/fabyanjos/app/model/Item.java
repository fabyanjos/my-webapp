package com.fabyanjos.app.model;

public class Item {

	private Long id;
	private String name;
	private Double value;
	private Long qty;
	private Double realValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
