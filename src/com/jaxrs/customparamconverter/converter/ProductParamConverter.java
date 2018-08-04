package com.jaxrs.customparamconverter.converter;

import javax.ws.rs.ext.ParamConverter;

import com.jaxrs.beanparam.model.Price;

public class ProductParamConverter implements ParamConverter<Price> {

	@Override
	public Price fromString(String currency) {
		// TODO Auto-generated method stub
		String[] tokens=currency.split(":");
		Price price=new Price();
	 price.setCurrencyType(tokens[0]);
	 price.setValue(Integer.parseInt(tokens[1]));
		
		return price;
	}

	@Override
	public String toString(Price price) {
		// TODO Auto-generated method stub
		return price.getCurrencyType()+":"+price.getValue();
	}
	

}
