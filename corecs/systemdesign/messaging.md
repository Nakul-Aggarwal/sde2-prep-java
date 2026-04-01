# Messaging

## Message Queues
- Asynchronous communication
- Decouple producers and consumers
- Buffer for load spikes

## Key Concepts
- **Producer**: Sends messages
- **Consumer**: Receives messages
- **Queue/Topic**: Message storage
- **Broker**: Manages queues/topics

## Messaging Patterns

### Point-to-Point
- One producer, one consumer
- Load balancing across consumers
- Message processed once

### Publish-Subscribe
- One producer, multiple consumers
- All subscribers get message
- Fan-out pattern

## Popular Systems

### Apache Kafka
- Distributed streaming platform
- Topics with partitions
- High throughput
- Retention policies

### RabbitMQ
- Message broker
- Multiple protocols
- Exchanges, queues, bindings
- Reliable delivery

### Amazon SQS
- Managed queue service
- At-least-once delivery
- Visibility timeout

## Message Semantics
- **At most once**: May lose messages
- **At least once**: May duplicate
- **Exactly once**: Guaranteed no loss/duplicates

## Challenges
- Message ordering
- Duplicate handling
- Dead letter queues
- Monitoring and observability

## Use Cases
- Event-driven architecture
- Microservices communication
- Log aggregation
- Real-time analytics