# Redis Notes

## What is Redis?
- In-memory data structure store
- Key-value database
- Supports various data types
- Can persist to disk

## Data Types
- **Strings**: Basic key-value
- **Lists**: Ordered collections
- **Sets**: Unordered unique elements
- **Hashes**: Field-value pairs
- **Sorted Sets**: Ordered unique elements with scores
- **Streams**: Log data structure
- **HyperLogLog**: Probabilistic cardinality estimation
- **Bitmaps**: Bit operations
- **Geospatial**: Location data

## Key Features
- Atomic operations
- Pub/Sub messaging
- Lua scripting
- Transactions
- Clustering
- Sentinel for high availability

## Use Cases
- Caching
- Session storage
- Real-time analytics
- Message queues
- Leaderboards
- Rate limiting

## Commands
- SET, GET (strings)
- LPUSH, RPOP (lists)
- SADD, SMEMBERS (sets)
- HSET, HGET (hashes)
- ZADD, ZRANGE (sorted sets)

## Persistence
- RDB: Point-in-time snapshots
- AOF: Append-only file, logs every write

## Clustering
- Data sharding across multiple nodes
- Automatic failover
- Horizontal scaling