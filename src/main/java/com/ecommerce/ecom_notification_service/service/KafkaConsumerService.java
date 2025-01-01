package com.ecommerce.ecom_notification_service.service;

import com.ecommerce.ecom_notification_service.event.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "emailTopic")
    public void handleEmail(OrderEvent orderEvent) {
        log.info("Received email for order: {}", orderEvent);
    }
}
