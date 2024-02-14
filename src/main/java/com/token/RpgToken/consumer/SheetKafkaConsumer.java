package com.token.RpgToken.consumer;

import com.token.RpgToken.model.RpgSheet;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SheetKafkaConsumer {

    @KafkaListener(topics = "${kafka.topic}")
    public void consumeMessage(RpgSheet sheet){

    }
}
