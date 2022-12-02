package pl.migibud.stockservice.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import pl.migibud.basedomains.dto.OrderEvent;

@Slf4j
@Service
class OrderConsumer {

    @KafkaListener(topics = "${spring.kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    void consume(OrderEvent event){
        log.info(String.format("Order event received in stock service => %s",event.toString()));
    }

}
