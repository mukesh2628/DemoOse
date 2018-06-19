package com.java;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
@Path("/customers")
public class HelloWorldService {
 
  @GET
  @Produces("text/html")
  public Response getOSEApp() {
 
           String output = "Hello OSE Application Deployed";
           return Response.status(200).entity(output).build();
  }
 
  @GET
  @Path("/nri")
  @Produces("text/html")
  public Response getOSEAppTomcat() {
 
            String output = "Hello OSE Application Deployed on Tomcat";
            return Response.status(200).entity(output).build();
  }
}
