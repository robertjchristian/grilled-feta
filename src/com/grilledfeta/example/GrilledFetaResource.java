package com.grilledfeta.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/api/hello")
// http://localhost:8080/api/hello/
public class GrilledFetaResource {

    @GET
    @Produces("text/plain")

    public String info() {

        return "Hello from Jersey on Google App Engine with Angular-Enterprise-Seed.";

    }

}

