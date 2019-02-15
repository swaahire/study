package com.swati.web.WebServiceAssignment.resource;


import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.swati.web.WebServiceAssignment.Address;
import com.swati.web.WebServiceAssignment.AddressService;

@Path("/addresses")
public class AddressResource {
	AddressService service = new AddressService();

	@POST
	@Path("/{zipcode}")
	   @Produces(MediaType.APPLICATION_JSON)
	public Address getAddress(@FormParam("zipcode") long zipcode) {
		return service.getAddress(zipcode);
	}
}
