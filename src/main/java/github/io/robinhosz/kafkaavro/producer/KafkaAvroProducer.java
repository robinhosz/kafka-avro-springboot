package github.io.robinhosz.kafkaavro.producer;

import github.io.robinhosz.kafkaavro.dto.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.springframework.kafka.support.SendResult;

@Service
public class KafkaAvroProducer {

    @Value("${topic.name}")
    private String topicName;

    private final KafkaTemplate<String, Employee> kafkaTemplate;

    public KafkaAvroProducer(KafkaTemplate<String, Employee> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(Employee employee){
        CompletableFuture<SendResult<String, Employee>> future = kafkaTemplate.send(topicName, UUID.randomUUID().toString(),employee);
        future.whenComplete((result, ex) -> {
            if (ex == null) {
                System.out.println("Sent message=[" + employee +
                        "] with offset=[" + result.getRecordMetadata().offset() + "]");
            } else {
                System.out.println("Unable to send message=[" +
                        employee + "] due to : " + ex.getMessage());
            }
        });
    }
}
