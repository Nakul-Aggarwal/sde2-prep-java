# Load Balancing

## What is Load Balancing?
- Distributes incoming traffic across multiple servers
- Improves availability, scalability, performance

## Types

### Hardware Load Balancers
- Dedicated devices (F5, Citrix)
- High performance
- Expensive

### Software Load Balancers
- NGINX, HAProxy, AWS ELB
- Cost-effective
- Flexible

## Load Balancing Algorithms

### Static
- **Round Robin**: Cycle through servers
- **Weighted Round Robin**: Based on server capacity
- **IP Hash**: Hash client IP for sticky sessions

### Dynamic
- **Least Connections**: Send to server with fewest connections
- **Least Response Time**: Based on response time
- **Resource Based**: CPU, memory usage

## Layer 4 vs Layer 7
- **Layer 4**: Transport layer (TCP/UDP)
- **Layer 7**: Application layer (HTTP)
- L7 can make routing decisions based on content

## Health Checks
- Ping servers regularly
- Remove unhealthy servers
- Add back when healthy

## Session Persistence
- Sticky sessions
- Server-side session storage
- Client-side cookies

## Global Load Balancing
- DNS-based
- Route to closest datacenter
- GeoDNS

## Challenges
- Single point of failure
- SSL termination
- Cost
- Configuration complexity