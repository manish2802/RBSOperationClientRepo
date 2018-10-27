package com.asthvinayak.rest.controller;
import java.sql.SQLException;
import java.util.List;
 import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
 import com.asthvinayak.bean.AccStatementDTO;
import com.asthvinayak.bean.CustomerDTO;
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
	@Path("/clist")
	@Produces({MediaType.APPLICATION_JSON})
	public List<CustomerDTO> getAllCust() throws SQLException
	{
		return creditCardService.getAllCustomer();
	}
	
	@POST
	@Path("/getcuststatejson")
	@Produces({MediaType.APPLICATION_JSON})
	public List<AccStatementDTO> getCustStatement(@FormParam("card_holder_name") String name,@FormParam("card_number") String cnum,@FormParam("cvv") String cvv,@FormParam("expiry_date") String edate) throws SQLException 
	{
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCard_num(cnum);
		customerDTO.setCust_name(name);
		customerDTO.setCvv(Integer.parseInt(cvv));
		customerDTO.setExp_date(edate);
		List<AccStatementDTO> list = creditCardService.getCustStatement(customerDTO);
		
		return list;
		/*return Response.status(200)
				.entity("addUser is called, name : "+customerDTO.getCard_num()).build();*/
		
	}
}