package com.rest.creditcard;

import java.net.URISyntaxException;
import javax.ws.rs.core.Response;
import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.creditcard.model.CreditCard;


@Path("/credit")
public class CreditCardService {

	
@GET
@Path("/get/cardID")
@Produces(MediaType.APPLICATION_XML)	
public CreditCard getCreditCard(@PathParam("cardID")String cardID)
{
CreditCard card=new CreditCard();
card.setCardID(cardID);
card.setCname("Suhas");
card.setCvv("123");
return card;

}



@POST
@Path("/create")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)

public CreditCard createCreditCard(CreditCard card){
	
card.setCname(card.getCname()+"updated");
return card;
		
}


@DELETE
@Path("/delete/{cardID}")
public Response deleteCreditCard(@PathParam("cardID")int cardID) throws URISyntaxException{
	
	
return Response.status(200).entity("Card with" +cardID+"is deleted suucessfully").build();	
	
}









}