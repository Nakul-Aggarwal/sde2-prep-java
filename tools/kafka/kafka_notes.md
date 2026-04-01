# Kafka Notes

## What is Apache Kafka?
- Distributed event streaming platform
- High-throughput, low-latency
- Publish-subscribe messaging
- Fault-tolerant, scalable

## Key Concepts

### Topics
- Categories for messages
- Producers write to topics
- Consumers read from topics

### Partitions
- Topics divided into partitions
- Ordered within partition
- Parallel processing

### Brokers
- Kafka servers
- Store and serve messages
- Handle replication

### Producers
- Send messages to topics
- Choose partition (round-robin, key-based)

### Consumers
- Read messages from topics
- Consumer groups for load balancing
- Offset tracking

### Zookeeper
- Manages cluster metadata
- Leader election
- Configuration management

## Features
- Durability with replication
- Exactly-once semantics
- Message retention
- Compression
- Security (SSL, SASL)

## Use Cases
- Log aggregation
- Event sourcing
- Stream processing
- Messaging
- Metrics collection

## Kafka Streams
- Client library for stream processing
- Stateful operations
- Windowing, joins
- Exactly-once processing

## Kafka Connect
- Integrates with external systems
- Source and sink connectors
- No-code data pipelines