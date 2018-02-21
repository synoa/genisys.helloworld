package de.synoa.genisys.helloworld.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class GettingStartedRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // @formatter:off

        from("timer:helloworld?period=5000").routeId("Hello World Route")
            .setBody(constant("WE ROCK SUPER HARD!"))
            .log("${body}")
        ;

        // @formatter:on
    }

}
