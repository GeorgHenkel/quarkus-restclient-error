package de.cgh.playground.impl;

import de.cgh.playground.api.ExternalApiResource;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "api-client")
public interface ApiClient extends ExternalApiResource
{
}
