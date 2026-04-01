# Redis Use Cases

## Caching
- Cache database queries
- Cache API responses
- Cache computed results
- TTL for cache expiration

## Session Storage
- Store user sessions
- Fast access compared to DB
- Automatic expiration

## Real-time Analytics
- Counters with INCR
- Unique visitor tracking with HyperLogLog
- Time-series data with sorted sets

## Message Queues
- Producer-consumer pattern
- Pub/Sub for broadcasting
- Reliable queues with persistence

## Leaderboards
- Sorted sets for rankings
- Gaming leaderboards
- Social media trending

## Rate Limiting
- Sliding window counters
- Token bucket algorithm
- API rate limiting

## Geospatial Data
- Store and query locations
- Find nearby points
- Calculate distances

## Distributed Locks
- SET NX for atomic locks
- Redlock algorithm for distributed locks

## Auto-complete
- Sorted sets for prefix matching
- Type-ahead search

## Time Series
- Store time-stamped data
- Downsampling
- Range queries