```
해결 ⭕️
DFS - 두 사람의 촌수(부모 자식 간의 관계 수) 구하기
```

# 문제
촌수는 부모와 자식 사이를 1촌으로 정의하고 이로부터 사람들 간의 촌수를 계산한다. 여러 사람들에 대한 부모 자식들 간의 관계가 주어질 때, 두 사람의 촌수를 계산하시오. 촌수를 계산할 수 없을 때는 -1을 출력하시오.
- 1 <= n <= 100

# 접근 방식
두 사람의 촌수를 구해야 하는데, 촌수는 그래프에서 두 노드 사이의 깊이를 의미하기 때문에 `DFS`를 생각했다.

# 풀이
- 인접리스트로 그래프 구현
- findRelatives 라는 재귀함수로 구현
  - graph : 그래프
  - visited : 방문처리 배열
  - start : 시작지점 & 현재노드
  - end : 도착지점
  - depth : 시작지점부터 현재까지의 탐색 깊이<br/><br/>
  - start와 end가 같아지면, 두 사람의 촌수를 구한 것이기 때문에 result를 depth로 갱신하고 return
  - 아니라면, 현재 노드인 start에 연결되어 있는 노드들 중 방문하지 않은 노드를 탐색
