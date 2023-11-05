package science.aculatus.pp.rossomlt.topics.resource;

import io.quarkus.security.Authenticated;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/topics")
public class TopicsResource {

    @GET
    public Response hello() {
        return Response.ok("Hello").build();
    }

    @GET
    @Path("t1")
    public Response test1() {
        return Response.ok("Test1").build();
    }

    @GET
    @Path("t2")
    @Authenticated
    public Response test2() {
        return Response.ok("Test2").build();
    }

}
