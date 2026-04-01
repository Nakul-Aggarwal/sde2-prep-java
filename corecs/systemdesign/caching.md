# Caching

## What is Caching?
- Temporary storage of frequently accessed data
- Improves performance and reduces load

## Types of Caches

### In-Memory Cache
- Redis, Memcached
- Fast access
- Volatile (lost on restart)

### CDN (Content Delivery Network)
- Distributed cache
- Closer to users
- Static content

### Database Cache
- Query result caching
- ORM caching

### Browser Cache
- Local storage in browser
- HTTP headers control caching

## Cache Strategies

### Cache-Aside (Lazy Loading)
- Application checks cache first
- If miss, fetches from DB and caches

### Write-Through
- Write to cache and DB simultaneously
- Ensures consistency

### Write-Behind (Write-Back)
- Write to cache first
- Async write to DB
- Better performance, risk of data loss

## Cache Eviction Policies
- **LRU**: Least Recently Used
- **LFU**: Least Frequently Used
- **TTL**: Time To Live
- **Random**: Random eviction

## Cache Invalidation
- **Push**: Update cache when data changes
- **Pull**: Check for staleness on read
- **TTL-based**: Expire after time

## Challenges
- Cache consistency
- Cache penetration
- Cache avalanche
- Cold start