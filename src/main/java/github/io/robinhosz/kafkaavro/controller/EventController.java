package github.io.robinhosz.kafkaavro.controller;

import github.io.robinhosz.kafkaavro.dto.Employee;
import github.io.robinhosz.kafkaavro.producer.KafkaAvroProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    private final KafkaAvroProducer kafkaAvroProducer;

    public EventController(KafkaAvroProducer kafkaAvroProducer) {
        this.kafkaAvroProducer = kafkaAvroProducer;
    }

    @PostMapping("/events")
    public String sendMessage(@RequestBody Employee employee) {
        kafkaAvroProducer.send(employee);
        return "Message sent successfully";
    }

}
