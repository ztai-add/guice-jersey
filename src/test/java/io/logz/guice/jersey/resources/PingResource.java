package io.logz.guice.jersey.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Asaf Alima on 19/12/2016.
 */
@Path(PingResource.PATH)
public class PingResource {

    public static final String PATH = "ping";
    public static final String MESSAGE = "pong";

    @GET
    public String ping() {
        return MESSAGE;
    }

}