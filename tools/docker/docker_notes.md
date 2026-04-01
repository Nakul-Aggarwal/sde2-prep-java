# Docker Notes

## What is Docker?
- Containerization platform
- Package applications with dependencies
- Run in isolated environments

## Key Concepts

### Images
- Read-only templates
- Built from Dockerfiles
- Stored in registries

### Containers
- Running instances of images
- Isolated processes
- Ephemeral by default

### Dockerfile
- Instructions to build images
- FROM, COPY, RUN, CMD, etc.

### Docker Compose
- Multi-container applications
- Define services in YAML
- Networking and volumes

## Commands
- `docker build`: Build image
- `docker run`: Run container
- `docker ps`: List containers
- `docker images`: List images
- `docker exec`: Run command in container
- `docker logs`: View logs

## Volumes
- Persistent data storage
- Mount host directories
- Named volumes

## Networking
- Bridge, host, overlay
- Container communication
- Port mapping

## Best Practices
- Use official base images
- Minimize layer count
- Use .dockerignore
- Run as non-root user
- Multi-stage builds

## Docker vs VMs
| Docker | VMs |
|--------|-----|
| OS level virtualization | Hardware virtualization |
| Lightweight | Heavy |
| Fast startup | Slow startup |
| Share host kernel | Separate kernel |