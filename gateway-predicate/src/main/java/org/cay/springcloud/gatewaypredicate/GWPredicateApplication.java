package org.cay.springcloud.gatewaypredicate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://cloud.spring.io/spring-cloud-static/spring-cloud-gateway/2.0.0.RELEASE/single/spring-cloud-gateway.html#_between_route_predicate_factory
 * 上面的地址有详细介绍
 */
@SpringBootApplication
public class GWPredicateApplication {

    public static void main(String[] args) {
        SpringApplication.run(GWPredicateApplication.class, args);
    }

}
