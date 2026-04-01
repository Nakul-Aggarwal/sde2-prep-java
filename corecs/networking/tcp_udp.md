# TCP/UDP

## TCP (Transmission Control Protocol)
- Connection-oriented
- Reliable delivery
- Ordered packets
- Flow control and congestion control
- Three-way handshake

### TCP Handshake
1. SYN (Client -> Server)
2. SYN-ACK (Server -> Client)
3. ACK (Client -> Server)

### Use Cases
- HTTP, FTP, SMTP
- File transfer
- Email

## UDP (User Datagram Protocol)
- Connectionless
- Unreliable delivery
- No ordering guarantee
- No flow/congestion control
- Faster, lower overhead

### Use Cases
- DNS queries
- Video streaming
- VoIP
- Gaming

## TCP vs UDP

| Feature | TCP | UDP |
|---------|-----|-----|
| Connection | Connection-oriented | Connectionless |
| Reliability | Reliable | Unreliable |
| Ordering | Guaranteed | Not guaranteed |
| Speed | Slower | Faster |
| Overhead | Higher | Lower |
| Error Checking | Yes | Basic |
| Use Cases | File transfer, web | Streaming, DNS |

## Ports
- TCP and UDP use ports (0-65535)
- Well-known ports: 80 (HTTP), 443 (HTTPS), 53 (DNS)