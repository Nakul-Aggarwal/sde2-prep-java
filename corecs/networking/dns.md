# DNS

## What is DNS?
- Domain Name System
- Translates domain names to IP addresses
- Hierarchical, distributed database

## How DNS Works
1. User types domain name
2. Browser checks local cache
3. Query sent to recursive resolver
4. Resolver queries root servers
5. Root refers to TLD servers
6. TLD refers to authoritative servers
7. Authoritative server returns IP
8. Result cached at multiple levels

## DNS Components
- **Recursive Resolver**: Performs full resolution
- **Root Servers**: 13 root servers worldwide
- **TLD Servers**: Handle top-level domains (.com, .org)
- **Authoritative Servers**: Hold actual records

## DNS Record Types
- **A**: IPv4 address
- **AAAA**: IPv6 address
- **CNAME**: Canonical name (alias)
- **MX**: Mail exchange
- **TXT**: Text records
- **NS**: Name server
- **SOA**: Start of Authority

## DNS Caching
- Browser cache
- OS cache
- ISP resolver cache
- TTL (Time To Live) controls caching duration

## DNS Security
- DNSSEC: Adds authentication and integrity
- DNS over HTTPS (DoH): Encrypts DNS queries
- DNS over TLS (DoT): Encrypts DNS traffic