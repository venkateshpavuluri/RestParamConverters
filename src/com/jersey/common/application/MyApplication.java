package com.jersey.common.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.jaxrs.beanparam.model.Price;
import com.jaxrs.customparamconverter.converter.ProductParamConverter;
import com.jaxrs.paramconverter.resource.ProductService;
import com.jaxrs.paramconverterprovider.provider.CustomParamConverterProvider;

@ApplicationPath("/api")
public class MyApplication extends Application{
	Set<Object>  set;
	Set<Class<?>> setClass;
	
	public  MyApplication()
	{
		set=new HashSet<>();
		setClass=new HashSet<>();
		set.add(new ProductService());
		setClass.add(CustomParamConverterProvider.class);
		
		
	}
	
	
	public Set<Object> getSingletons()
	{
		return set;
		
	}
	

	public Set<Class<?>> getClasses()
	{
		return setClass;
		
	}
	

	

}
