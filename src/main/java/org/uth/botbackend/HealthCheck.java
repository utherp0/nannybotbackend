package org.uth.botbackend;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/health")
public class HealthCheck
{
  @GET
  @Path("/check")
  @Produces("application/json")
  public String healthResponse() 
  {
    return "active";
  }
}