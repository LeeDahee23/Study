```
해결⭕️, 구현
퀸은 장애물이 있으면 이동할 수 없음
```

# 문제

nxm 크기의 체스판에서 queen, knight, pawn이 있음.

- queen은 가로, 세로, 대각선 방향으로 계속 움직일 수 있지만 장애물을 만나면 더이상 이동할 수 없음
- knight는 자신을 기준으로 2x3 직사각형을 그렸을 때 반대쪽 꼭짓점으로 이동할 수 있음
- pawn은 장애물의 역할만 함

말들이 이동할 수 없는 칸의 개수를 구하시오.

### 제한사항

- 1 <= n, m <= 1000
- 0 <= Knight, Queen, Pawn의 개수 <= 100

# 풀이

- queen과 knight가 이동할 수 있는 방향을 2차원 배열로 저장
  - queen: {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {-1, 1}, {1, -1}, {-1, -1}}
  - knight: {{-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {-2, -1}, {-2, 1}, {2, -1}, {2, 1}}
- 현재 말이 있는 위치를 0이 아닌 숫자로 표현함
  - 0은 말이 없는 칸, 1은 초기 말이 위치한 위치, 2는 말이 이동해서 도착한 위치
- 체스판을 돌면서 queen이라면 queen 방식대로 이동하고, knight라면 knight 방식대로 이동함
  - queen은 이동할 수 있는 방향으로 장애물을 만나거나 범위를 벗어나기 전까지 계속 이동할 수 있음
  - knight는 이동할 수 있는 위치 중 범위를 벗어나지 않고 말이 없는 곳으로 이동할 수 있음
- 체스판에서 0인 칸의 개수를 구하면 답

1. 체스판을 돌면서 말이 있으면 이동하는 방식
   - nxm 만큼 배열을 돌아야 하기 때문에 기본적으로 시간복잡도가 O(nxm)임
   - n과 m이 최대 1000까지 나올 수 있기 때문에 1,000,000 부터 시작 => 시간복잡도가 큼
2. **queen과 knight가 있는 위치만 받아서 이동하는 방식**
   - queen의 위치와 knight의 위치를 따로 저장해서 그만큼만 이동하면 됨
   - queen과 knight는 100개 이하이기 떄문에 10,000 부터 시작
   - 시간복잡도를 줄이기 위해 2번 방법으로 풀이함.
