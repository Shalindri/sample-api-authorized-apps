package org.sample.api.authorized.apps.endpoint.v1;

import javax.ws.rs.core.Response;


public interface MeApiService {

      public Response deleteLoggedInUserAuthorizedAppByAppId(String applicationId);

      public Response deleteLoggedInUserAuthorizedApps();

      public Response listLoggedInUserAuthorizedApps();
}
