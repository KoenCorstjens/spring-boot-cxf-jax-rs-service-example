package eu.corstjens.example.spring.boot.cxf.webservice.endpoint;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * Created by koencorstjens on 22/02/17.
 */
@Api
@Path("/test-example")
public interface ExempleEndpoint {

    @POST
    @Path("/sendMessages")
    @Produces({MediaType.APPLICATION_JSON})
    @ApiOperation(value = "send a messages" ,response = BasicResponse.class)
    BasicResponse sendMessages(Request request);

    @POST
    @Path("/getCodeForFirstNameLastName")
    @Produces({MediaType.APPLICATION_JSON})
    @ApiOperation(value = "Get code for first name and second name" ,response = BasicResponse.class)
    BasicResponse getCodeForFirstNameLastName(RequestGetCodeForFirstNameLastName request);

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    String test();
}
