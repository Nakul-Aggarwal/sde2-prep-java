# Sharding

## What is Sharding?
- Horizontal partitioning of data across multiple servers
- Each shard contains a subset of the data

## Types
- **Range Sharding**: Based on ranges of a key (e.g., user_id 1-1000)
- **Hash Sharding**: Hash function distributes data
- **Directory-based Sharding**: Lookup table maps keys to shards

## Consistent Hashing
- Ring of hash values
- Nodes and data mapped to ring
- Advantages: Minimal data movement when nodes added/removed

## Challenges
- Cross-shard queries
- Rebalancing data
- Schema changes across shards
- Backup and recovery

## When to Use
- Large datasets that don't fit on single server
- High write throughput
- Geographic distribution