package com.practice.gatewayproxy.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;


@Configuration
class ProxyConfig {

    @Bean
    RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("purchase_service_route",
                        route -> route.path("/purchase-service/**")
                                .and()
                                .method(HttpMethod.GET)
                                .filters(filter -> filter.stripPrefix(1)
                                )
                                .uri("lb://purchase-service"))
                .route("security_route",
                        route -> route.path("/security-service/**")
                                .filters(filter -> filter.stripPrefix(1)
                                )
                                .uri("lb://security-service"))
                .build();
    }
}
