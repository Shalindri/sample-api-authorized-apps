package org.sample.api.authorized.apps.endpoint.v1.impl;

import org.sample.api.authorized.apps.endpoint.v1.MeApiService;

import javax.ws.rs.core.Response;

public class MeApiServiceImpl implements MeApiService {

    @Override
    public Response deleteLoggedInUserAuthorizedAppByAppId(String applicationId) {

        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response deleteLoggedInUserAuthorizedApps() {

        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response listLoggedInUserAuthorizedApps() {

        // do some magic!
        return Response.ok().entity("magic!").build();
    }
}
