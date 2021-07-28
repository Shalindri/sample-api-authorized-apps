/*
* Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.sample.api.authorized.apps.endpoint.v1.impl;

import org.sample.api.authorized.apps.endpoint.v1.*;
import org.sample.api.authorized.apps.endpoint.v1.model.*;
import java.util.List;
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
