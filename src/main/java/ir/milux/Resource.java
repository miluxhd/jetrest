package ir.milux;


import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/search")
public class Resource extends  ResourceConfig{

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public OResponse getIt(ORequest request) {
        System.out.println(request);
        OResponse response = new OResponse("response!");

        return response;
    }

}
