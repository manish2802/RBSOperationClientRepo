package com.asthvinayak.rest.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.asthvinayak.bean.TransactionsDetailsDTO;
import com.asthvinayak.service.CreditCardService;
import com.asthvinayak.service.impl.CreditCardServiceImpl;

@Path("/card")
public class CreditCardController {
	
	@Context
	UriInfo uriInfo;
	
	@Context
	Request request;
	
	CreditCardService creditCardService;
	public CreditCardController() {
		creditCardService = new CreditCardServiceImpl();
	}
	
	@GET
	@Path("/clist/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public List<TransactionsDetailsDTO> getTransaction(@PathParam("id") int i)
	{
		return creditCardService.gettransactionDetails(i);
	}
	
	
	


		
	
	
	
	
	
}
