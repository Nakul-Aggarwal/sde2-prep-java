# Scheduling

## CPU Scheduling
- Decides which process runs when
- Goals: Maximize CPU utilization, minimize response time, fairness

## Types

### Preemptive
- Can interrupt running process
- Examples: Round Robin, SRTF, Priority

### Non-Preemptive
- Process runs until completion or I/O
- Examples: FCFS, SJF

## Algorithms

### FCFS (First Come First Served)
- Queue based
- Simple but convoy effect

### SJF (Shortest Job First)
- Optimal for minimizing average waiting time
- Hard to predict burst time

### SRTF (Shortest Remaining Time First)
- Preemptive SJF
- May starve long processes

### Round Robin
- Time quantum
- Fair but context switching overhead

### Priority Scheduling
- Each process has priority
- Can be preemptive or non-preemptive
- Starvation risk

### Multilevel Queue
- Multiple queues with different priorities
- Different scheduling for each queue

## Performance Metrics
- CPU Utilization
- Throughput
- Turnaround Time
- Waiting Time
- Response Time