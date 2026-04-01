# Idempotency

## What is Idempotency?
- Operation can be applied multiple times without changing result
- Safe to retry

## Why Important?
- Network failures
- Duplicate requests
- Message queues
- Distributed systems

## HTTP Methods
- **GET**: Naturally idempotent
- **PUT**: Idempotent (updates same resource)
- **DELETE**: Idempotent (deleting already deleted is ok)
- **POST**: Not idempotent (creates new resources)

## Implementing Idempotency

### Idempotency Keys
- Client provides unique key
- Server checks if already processed
- Return cached result

### Database Constraints
- Unique constraints
- Upsert operations

### State Machines
- Operations that transition state safely

## Examples

### Payment Processing
- Use payment ID as idempotency key
- Prevent duplicate charges

### Order Creation
- Check if order already exists
- Return existing order ID

### Message Processing
- Consumer checks message ID
- Skip if already processed

## Challenges
- Storage of idempotency keys
- Expiration
- Cleanup
- Performance impact

## Best Practices
- Use UUIDs or hashes as keys
- Store in Redis with TTL
- Include in request headers
- Return same response for duplicate requests