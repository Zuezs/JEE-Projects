package com.eintern.training.RestServiceExample.Domains;

public class Item {

	private String sku;
	private String itemName;
	private String itemDescription;
	
	
	Person person = new Person();


	public String getSku() {
		return sku;
	}


	public void setSku(String sku) {
		this.sku = sku;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemDescription() {
		return itemDescription;
	}


	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}
	
	//Get all items by ownerID
	//get Item by SKU
	//Update Item by SKU
	//Insert into new Item
	//Delete Item by SKU
	
	
	
}
