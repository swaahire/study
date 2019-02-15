package com.swati.web.WebServiceAssignment;

import javax.ws.rs.FormParam;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/myresource")
public class ValidateUser {
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String validate(@FormParam("username") String username,
			@FormParam("password") String password) {
		if (username.equals("swati") && password.equals("abc")) {
			return "Valid Username & password";
		} else {
			return "Invalid";
		}
	}
}
