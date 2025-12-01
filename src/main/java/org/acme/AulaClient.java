package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@RegisterRestClient(configKey = "aulas-api")
@Path("/aulas")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface AulaClient {

    @GET
    List<Aula> listar();

    @GET
    @Path("/{id}")
    Aula buscar(@PathParam("id") int id);
}
