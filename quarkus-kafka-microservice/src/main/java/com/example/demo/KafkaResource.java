package com.example.demo;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/events")
public class KafkaResource {

    @Inject
    KafkaProducer kafkaProducer;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response sendEvent(String message) {
        kafkaProducer.sendMessage(message);
        return Response.ok("{\"status\": \"Mensagem enviada para Kafka\"}").build();
    }
}
