package de.cgh.playground.service;

import de.cgh.playground.api.ExternalApiResource;

import javax.ws.rs.core.Response;
import java.util.Map;

public class ExternalApiResourceImpl implements ExternalApiResource
{
    @Override
    public Response getByName(String name)
    {
        return Response.ok(Map.of("name", name)).build();
    }
}
