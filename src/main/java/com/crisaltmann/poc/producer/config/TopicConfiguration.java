package com.crisaltmann.poc.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfiguration {

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name("sample-topic")
                .partitions(2)
                .replicas(1)
                .build();
    }

}
