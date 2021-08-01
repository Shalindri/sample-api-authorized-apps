package org.sample.api.authorized.apps.endpoint.v1.factories;

import org.sample.api.authorized.apps.endpoint.v1.MeApiService;
import org.sample.api.authorized.apps.endpoint.v1.impl.MeApiServiceImpl;

public class MeApiServiceFactory {

   private final static MeApiService service = new MeApiServiceImpl();

   public static MeApiService getMeApi()
   {
      return service;
   }
}
