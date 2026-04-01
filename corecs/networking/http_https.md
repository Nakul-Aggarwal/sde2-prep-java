# HTTP/HTTPS

## HTTP
- HyperText Transfer Protocol
- Application layer protocol
- Stateless, request-response

## HTTP Methods
- **GET**: Retrieve data
- **POST**: Create resource
- **PUT**: Update resource
- **DELETE**: Remove resource
- **PATCH**: Partial update
- **HEAD**: Get headers only
- **OPTIONS**: Get supported methods

## Status Codes
- **1xx**: Informational
- **2xx**: Success (200 OK, 201 Created)
- **3xx**: Redirection (301 Moved, 302 Found)
- **4xx**: Client Error (400 Bad Request, 401 Unauthorized, 404 Not Found)
- **5xx**: Server Error (500 Internal Server, 502 Bad Gateway)

## HTTPS
- HTTP over SSL/TLS
- Encrypts data in transit
- Provides authentication and integrity
- Uses certificates for trust

## HTTP vs HTTPS
| HTTP | HTTPS |
|------|-------|
| Port 80 | Port 443 |
| Plain text | Encrypted |
| No certificates | SSL certificates |
| Faster | Slightly slower |

## HTTP/2
- Multiplexing
- Header compression
- Server push
- Binary protocol