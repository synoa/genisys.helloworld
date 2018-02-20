package de.synoa.genisys.helloworld.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import static de.synoa.genisys.helloworld.configurations.MongoDB.MONGODB_DB_STATS;

@Component
public class GettingStartedRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // @formatter:off

        from("timer:helloworld?period=5000").routeId("Hello World Route")
            .setBody(constant("Hello Microservice World"))
            .to("activemq:{{activemq.queue.prefix}}.talk")
        ;

        from("activemq:{{activemq.queue.prefix}}.talk").routeId("Talk Route")
            .log("${body}")
            .to(MONGODB_DB_STATS)
            .log("${body}")
        ;

        // @formatter:on
    }

}
