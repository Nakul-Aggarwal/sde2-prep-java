# Deadlocks

## What is a Deadlock?
- Situation where two or more processes are unable to proceed
- Each waiting for resources held by others
- Circular waiting condition

## Coffman Conditions (Necessary Conditions)
1. **Mutual Exclusion**: Resources can't be shared
2. **Hold and Wait**: Process holds resource while waiting for another
3. **No Preemption**: Resources can't be forcibly taken
4. **Circular Wait**: Circular chain of processes waiting for resources

## Prevention
- Eliminate one of the four conditions
- **Mutual Exclusion**: Allow sharing (not always possible)
- **Hold and Wait**: Request all resources at once
- **No Preemption**: Allow preemption
- **Circular Wait**: Order resources, request in order

## Avoidance
- **Banker's Algorithm**: Check if granting request leads to unsafe state
- Resource allocation graph with request edges

## Detection
- Check for cycles in resource allocation graph
- Recovery: Kill processes, rollback

## Real-World Examples
- Dining Philosophers Problem
- Database locking
- Thread synchronization issues