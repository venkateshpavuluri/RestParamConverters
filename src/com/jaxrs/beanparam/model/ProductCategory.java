package com.jaxrs.beanparam.model;

public class ProductCategory {
	public ProductCategory(String categoryid)
	{
		String[] token=categoryid.split("_");
		this.id=Integer.parseInt(token[0]);
		this.productName=token[1];
 	}
	private int id;
	private String productName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
