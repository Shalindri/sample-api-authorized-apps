package org.sample.api.authorized.apps.endpoint.v1;

import org.springframework.beans.factory.annotation.Autowired;

import org.sample.api.authorized.apps.endpoint.v1.model.AuthorizedAppDTO;
import org.sample.api.authorized.apps.endpoint.v1.model.ErrorDTO;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import io.swagger.annotations.*;

@Path("/me")
@Api(description = "The me API")

public class MeApi  {

    @Autowired
    private MeApiService delegate;

    @Valid
    @DELETE
    @Path("/authorized-apps/{application-id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Removes authorized app by app ID for the authenticated user", notes = "Removes authorized OAuth app by an app ID for the authenticated user", response = Void.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Item Deleted", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Resource Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "The specified resource was not found", response = ErrorDTO.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorDTO.class)
    })
    public Response deleteLoggedInUserAuthorizedAppByAppId(@ApiParam(value = "Application ID",required=true) @PathParam("application-id") String applicationId) {

        return delegate.deleteLoggedInUserAuthorizedAppByAppId(applicationId );
    }

    @Valid
    @DELETE
    @Path("/authorized-apps")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Removes authorized applications for the authenticated user", notes = "Removes approved OAuth applications of the authenticated user", response = Void.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Item Deleted", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Resource Forbidden", response = Void.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorDTO.class)
    })
    public Response deleteLoggedInUserAuthorizedApps() {

        return delegate.deleteLoggedInUserAuthorizedApps();
    }

    @Valid
    @GET
    @Path("/authorized-apps")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List authorized applications for the authenticated user", notes = "Lists approved OAuth applications of the authenticated user", response = AuthorizedAppDTO.class, responseContainer = "List", authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "me" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = AuthorizedAppDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Resource Forbidden", response = Void.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorDTO.class)
    })
    public Response listLoggedInUserAuthorizedApps() {

        return delegate.listLoggedInUserAuthorizedApps();
    }

}
