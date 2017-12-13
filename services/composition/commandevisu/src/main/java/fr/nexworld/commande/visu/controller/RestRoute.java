package fr.nexworld.commande.visu.controller;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import fr.nexworld.commande.visu.pojo.*;

@Component
class RestRoute extends RouteBuilder {

    @Value("${rest.host}")
    String host;
    @Value("${rest.port}")
    String port;

    @Override
    public void configure() throws Exception {
        restConfiguration()
                .component("jetty")
                .host(host).port(port)
                .bindingMode(RestBindingMode.json);

        rest("/things")
                .post()
                .type(Thing)
                .to("direct:createThing")
                .get()
                .outType(ThingSearchResults)
                .to("direct:getThings")
                .get("/{id}")
                .outType(Thing)
                .to("direct:getThing")
                .delete("/{id}")
                .outType(Thing)
                .to("direct:removeThing");
    }
}
