/**
  * Copyright (C) 2018 Red Hat inc.
  * 
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  * 
  *         http://www.apache.org/licenses/LICENSE-2.0
  * 
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  * 
**/
package me.snowdrop.servicecatalog.api.model;

import io.fabric8.kubernetes.api.KubernetesResourceMappingProvider;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import java.util.HashMap;
import java.util.Map;

public class ServiceCatalogResourceMappingProvider implements KubernetesResourceMappingProvider {

    public final Map<String, Class<? extends KubernetesResource>> mappings = new HashMap<>();

    public ServiceCatalogResourceMappingProvider () {
        mappings.put("ClusterServiceBroker", ClusterServiceBroker.class); 
        mappings.put("ClusterServiceClass", ClusterServiceClass.class); 
        mappings.put("ClusterServicePlan", ClusterServicePlan.class); 
        mappings.put("ServiceBroker", ServiceBroker.class); 
        mappings.put("ServiceBinding", ServiceBinding.class); 
        mappings.put("ServiceInstance", ServiceInstance.class); 
    }
     
    public Map<String, Class<? extends KubernetesResource>> getMappings() {
        return mappings;
    }
}