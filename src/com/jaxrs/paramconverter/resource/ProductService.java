package com.jaxrs.paramconverter.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jaxrs.beanparam.model.Price;

@Path("/priceConvert")
public class ProductService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{productName}/{price}")
	public String convertPrice(@PathParam ("productName") String productName,@PathParam("price") Price price)
	{
		return price.getCurrencyType()+"::"+price.getValue();
	}

}
