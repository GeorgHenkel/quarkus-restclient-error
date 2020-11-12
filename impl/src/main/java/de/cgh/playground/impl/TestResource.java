package de.cgh.playground.impl;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TestResource
{
    private final ApiClient apiClient;
    private final ApiClientWithPathAnnotation apiClientWithPathAnnotation;

    TestResource(@RestClient ApiClient apiClient, @RestClient ApiClientWithPathAnnotation apiClientWithPathAnnotation)
    {
        this.apiClient = apiClient;
        this.apiClientWithPathAnnotation = apiClientWithPathAnnotation;
    }

    @GET
    @Path("/{name}")
    public Response testRestClient(@PathParam("name") String name)
    {
        return apiClient.getByName(name);
    }

    @GET
    @Path("/with-path/{name}")
    public Response testRestClientWithPathAnnotation(@PathParam("name") String name)
    {
        return apiClientWithPathAnnotation.getByName(name);
    }
}
