package de.cgh.playground.impl;

import de.cgh.playground.api.ExternalApiResource;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.Path;

@Path("/api/external")
@RegisterRestClient(configKey = "api-client")
public interface ApiClientWithPathAnnotation extends ExternalApiResource
{
}
