import sys
from heapq import heapify, heappop

def dijkstra():
    while heapQueue:
        start = heappop(heapQueue)
        for i in range(m):
            if u[i] == start:
                relax(u[i], v[i], weight[i])
                temp = v[i]
                heapQueue[temp] = dist[temp]
    
def relax(u, v, weight):
    if dist[v] > dist[u] + weight:
        dist[v] = dist[u] + weight
        parent[v] = u


# Global

# n = 노드 개수 
n = int(input())
# m = 엣지 개수
m = int(input())

parent = [0] * n
maxInt = sys.maxsize
dist = [maxInt] * n
dist[0] = 0
heapQueue = dist
heapify(heapQueue)


#  엣지 정보 (시작, 끝, 가중치)
u = [0] * m
v = [0] * m
weight = [0] * m

for i in range(m):
    u[i], v[i], weight[i]  = input().split()
    u[i] = int(u[i])
    v[i] = int(v[i])
    weight[i] = int(weight[i])

dijkstra()
for i in dist:
    if i == maxInt:
        dist[i] = "inf"

print(dist)