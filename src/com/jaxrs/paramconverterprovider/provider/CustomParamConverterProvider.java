package com.jaxrs.paramconverterprovider.provider;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

import com.jaxrs.beanparam.model.Price;
import com.jaxrs.customparamconverter.converter.ProductParamConverter;
@Provider
public class CustomParamConverterProvider implements ParamConverterProvider {

	@Override
	public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
		// TODO Auto-generated method stub
		
		
		ParamConverter paramConverter=null;
		
		if(rawType.isAssignableFrom(Price.class))
		{
			System.out.println("price class");
			paramConverter=(ParamConverter<Price>)new ProductParamConverter();
			//paramConverter.fromString(value);
		}
		System.out.println("RawType is=="+rawType);
		System.out.println("generic type iss==="+genericType);
		for(Annotation annotation:annotations)
		{
			System.out.println("Annotations are=="+annotation);
		}
		return paramConverter;
	}

}
