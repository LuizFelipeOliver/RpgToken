package com.token.RpgToken.service;

import com.token.RpgToken.model.RpgSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SheetKafkaProducer {

    @Autowired
    private KafkaTemplate<String, RpgSheet> kafkaTemplate;

    @Value("${kafka.topic}")
    private String topic;

    private void sendMessage(RpgSheet sheet){
        kafkaTemplate.send(topic,  sheet);
    }
}
