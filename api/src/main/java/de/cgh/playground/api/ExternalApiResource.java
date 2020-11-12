package de.cgh.playground.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/external")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface ExternalApiResource
{
    @GET
    @Path("/{name}")
    Response getByName(@PathParam("name") String name);
}
