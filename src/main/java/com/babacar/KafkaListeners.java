package com.babacar;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics="Babacar",
            groupId="groupId"
    )
     void listeners(String data){
        System.out.println("Listener receveid :" + data+"=====");
    }
}
