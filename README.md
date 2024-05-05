# Kafka Avro Application

This is an example application demonstrating how to use Apache Kafka with Avro serialization/deserialization.

## Prerequisites

- Java 8 or higher installed
- Apache Kafka installed and running
- Schema Registry configured and running <br><br>

## Configuration

1. Clone this repository:

```bash
git clone https://github.com/robinhosz/kafka-avro-springboot.git
cd kafka-avro-springboot <br><br>


## Usage

### Producing Messages

To produce messages to the Kafka topic, send an HTTP POST request to the `/api/produce` endpoint with a JSON message body:

Example request using cURL:

curl -X POST http://localhost:8181
-H 'Content-Type: application/json'
-d '{
"id": "1",
"firstname": "John",
"lastName": "Doe",
"email": "john.doe@example.com",
"age": 30
}' <br><br>


### Consuming Messages

The produced messages can be consumed from the Kafka topic defined by the application. To view the consumed messages, check the application logs. <br><br>



### 🧑 Author

 <img style="border-radius: 8px" src="https://user-images.githubusercontent.com/82779533/158067762-8d25be74-d955-41da-8a96-f400e75f902b.jpg" width="100px;" alt="José Robson"/>

<strong>José Robson</strong>
