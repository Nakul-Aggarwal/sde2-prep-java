# Kubernetes Notes

## What is Kubernetes?
- Container orchestration platform
- Automates deployment, scaling, management
- Open-source, originally by Google

## Key Concepts

### Pods
- Smallest deployable unit
- One or more containers
- Shared storage and network

### Services
- Expose pods to network
- Load balancing
- Service discovery

### Deployments
- Manage replica sets
- Rolling updates
- Rollbacks

### ConfigMaps & Secrets
- Configuration data
- Environment variables
- Sensitive data (encrypted)

### Volumes
- Persistent storage
- Types: hostPath, NFS, cloud storage

### Namespaces
- Virtual clusters
- Resource isolation

## Architecture
- **Master Node**: API server, scheduler, controller manager, etcd
- **Worker Nodes**: Kubelet, kube-proxy, container runtime

## kubectl Commands
- `kubectl get`: List resources
- `kubectl describe`: Detailed info
- `kubectl logs`: Container logs
- `kubectl exec`: Run command in pod
- `kubectl apply`: Apply configuration
- `kubectl delete`: Remove resources

## Scaling
- Horizontal Pod Autoscaler
- Cluster Autoscaler
- Manual scaling with kubectl

## Networking
- CNI plugins (Calico, Flannel)
- Ingress controllers
- Network policies

## Security
- RBAC (Role-Based Access Control)
- Pod Security Standards
- Network policies
- Image scanning

## Monitoring
- Metrics Server
- Prometheus
- Grafana dashboards