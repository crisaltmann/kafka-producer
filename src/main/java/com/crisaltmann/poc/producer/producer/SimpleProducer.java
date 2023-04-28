package com.crisaltmann.poc.producer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
@RequiredArgsConstructor
public class SimpleProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendRandomUUID() {
        log.info("Sending event to simple-topic");
        kafkaTemplate.send("simple-topic", UUID.randomUUID().toString());
    }

}
