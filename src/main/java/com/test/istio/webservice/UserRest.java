package com.test.istio.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class UserRest {

	@GET
	@Path("/users")
	public Response getUsers() {
		String output = "Istio is fucking crazy";
		return Response.status(200).entity(output).build();
	}

}
