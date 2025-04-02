package com.example.demo;

import io.smallrye.reactive.messaging.annotations.Blocking;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class KafkaConsumer {

    @Incoming("events-in")
    @Blocking
    public void processMessage(String message) {
        System.out.println("📥 Mensagem recebida do Kafka: " + message);
    }
}
