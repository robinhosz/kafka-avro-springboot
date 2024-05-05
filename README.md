# Kafka Avro Application

This is an example application demonstrating how to use Apache Kafka with Avro serialization/deserialization.

## Prerequisites

- Java 8 or higher installed
- Apache Kafka installed and running
- Schema Registry configured and running

## Configuration

1. Clone this repository:

```bash
git clone https://github.com/robinhosz/kafka-avro-springboot.git
cd kafka-avro-springboot


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
}'


### Consuming Messages

The produced messages can be consumed from the Kafka topic defined by the application. To view the consumed messages, check the application logs.
