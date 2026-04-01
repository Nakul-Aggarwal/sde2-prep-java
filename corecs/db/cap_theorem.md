# CAP Theorem

## The Theorem
In a distributed system, you can only guarantee **two** out of three properties:
- **Consistency**: All nodes see the same data at the same time
- **Availability**: Every request receives a response
- **Partition Tolerance**: System continues to operate despite network partitions

## CAP Combinations

### CA (Consistency + Availability)
- Sacrifices Partition Tolerance
- Traditional RDBMS in single datacenter
- Not suitable for distributed systems

### CP (Consistency + Partition Tolerance)
- Sacrifices Availability
- Examples: MongoDB, HBase
- May reject requests during partitions

### AP (Availability + Partition Tolerance)
- Sacrifices Consistency
- Examples: Cassandra, DynamoDB
- Eventual consistency

## Real-World Examples
- **Banking**: CP (consistency critical)
- **Social media**: AP (availability preferred)
- **E-commerce catalog**: AP with eventual consistency