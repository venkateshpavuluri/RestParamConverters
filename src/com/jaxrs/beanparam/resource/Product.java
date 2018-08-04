package com.jaxrs.beanparam.resource;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jaxrs.beanparam.model.ProductCategory;
import com.jaxrs.beanparam.model.ProductInfo;

@Path("/product")
public class Product {
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/searchProduct/{productName}")
	public String product(@BeanParam ProductInfo productInfo )
	{
		return productInfo.getAppId() +"=="+productInfo.productBrand+"=="+productInfo.productName+"=="+productInfo.getProductType()+"=="+productInfo.getUserName();
	}
	//Java parameter type Automatic convertion 
	//all primitive types are autmatically converted
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/Product/{productNo}")
	public String getproduct(@PathParam("productNo") float productNo )
	{
		//return productInfo.getAppId() +"=="+productInfo.productBrand+"=="+productInfo.productName+"=="+productInfo.getProductType()+"=="+productInfo.getUserName();
	return ""+productNo;
	}
	//Java parameter type Automatic convertion 
	//class must contains single  string arg constructor or static valueOf method
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/productCatogry/{categoryid}")
	public String getproduct(@PathParam("categoryid") ProductCategory productCategory )
	{
		//return productInfo.getAppId() +"=="+productInfo.productBrand+"=="+productInfo.productName+"=="+productInfo.getProductType()+"=="+productInfo.getUserName();
	return productCategory.getId()+productCategory.getProductName();
	}
	

}
