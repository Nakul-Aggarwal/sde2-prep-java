# Processes and Threads

## Processes
- A program in execution
- Has its own memory space
- Independent execution
- Communication via IPC (pipes, sockets, shared memory)

## Threads
- Lightweight process
- Shares memory with parent process
- Multiple threads in one process
- Faster context switching than processes

## Multithreading
- Concurrent execution within a process
- Benefits: Responsiveness, resource sharing, economy
- Challenges: Synchronization, race conditions, deadlocks

## Process vs Thread
| Aspect | Process | Thread |
|--------|---------|--------|
| Memory | Separate | Shared |
| Creation | Heavy | Light |
| Communication | IPC | Shared memory |
| Context Switch | Expensive | Cheap |

## Thread States
- New, Runnable, Running, Blocked, Terminated

## Threading Models
- User-level threads
- Kernel-level threads
- Hybrid