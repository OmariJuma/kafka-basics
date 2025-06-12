package com.omarjuma.kafka.utils;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "myFirstTopic", groupId = "groupId")
    void listener(String data, @Header(KafkaHeaders.RECEIVED_PARTITION) int partition, @Payload String payload){
        System.out.println("Listener received the message "+data+"❤");
// partition and payload
        System.out.println("Partition "+partition + " Payload "+ payload);
    }
}
