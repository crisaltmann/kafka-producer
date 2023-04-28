package com.crisaltmann.poc.producer.scheduler;

import com.crisaltmann.poc.producer.producer.SimpleProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProducerScheduler {

    @Autowired
    private SimpleProducer simpleProducer;

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        simpleProducer.sendRandomUUID();
    }

}
