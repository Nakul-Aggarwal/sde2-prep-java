# Scaling

## Vertical Scaling (Scale Up)
- Add more resources to single server
- CPU, RAM, storage
- Easier but limited

## Horizontal Scaling (Scale Out)
- Add more servers
- Load balancing
- More complex but unlimited

## Scaling Dimensions

### Scale by Load
- Auto-scaling based on metrics
- Cloud services (AWS Auto Scaling)

### Scale by Function
- Microservices
- Different services scale independently

### Scale by Data
- Sharding
- Replication

## Load Balancing
- Distribute traffic across servers
- Algorithms: Round Robin, Least Connections, IP Hash

## Database Scaling
- Read replicas
- Sharding
- NoSQL for horizontal scaling

## Caching for Scale
- Reduce DB load
- CDN for static content

## Challenges
- State management
- Data consistency
- Network latency
- Cost

## Monitoring
- Key metrics: CPU, memory, network
- Auto-scaling triggers
- Health checks