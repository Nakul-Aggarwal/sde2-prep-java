# Consistent Hashing

## What is Consistent Hashing?
- Hashing technique for distributed systems
- Minimal data movement when nodes added/removed
- Used in sharding, load balancing

## How it Works
- Hash space as a ring (0 to 2^32-1)
- Nodes mapped to points on ring
- Data keys mapped to ring
- Data assigned to next node clockwise

## Virtual Nodes
- Each physical node has multiple virtual nodes
- Better distribution
- Easier rebalancing

## Adding a Node
- New node gets range from neighbors
- Only data in that range moves
- Other data stays put

## Removing a Node
- Data redistributed to remaining nodes
- Minimal disruption

## Advantages
- Scalable
- Fault tolerant
- Load distribution

## Use Cases
- Distributed caches (Redis Cluster)
- Database sharding (Cassandra)
- Load balancers
- DHT (Distributed Hash Tables)

## Challenges
- Hot spots
- Virtual node management
- Replication

## Alternatives
- Modulo hashing (not consistent)
- Rendezvous hashing