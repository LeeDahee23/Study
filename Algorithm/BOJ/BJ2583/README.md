```
⭕️, bfs
분리된 영역의 개수와 넓이
헷갈린 부분: 행열(x, y 좌표)
```

# 문제

MxN 크기의 모눈종이가 있고 K개의 직사각형을 그 위에 그린다. 직사각형 내부를 제외한 나머지 영역들의 개수와 각 넓이를 구해 출력하는 프로그램을 작성하시오.

- M, N, K <= 100
- 직사각형 왼쪽 아래 꼭짓점의 x,y 좌표점과 오른쪽 위 꼭짓점의 x,y 좌표점이 주어짐.
- 모눈종이의 왼쪽 아래 꼭짓점은 (0,0), 오른쪽 위 꼭짓점의 좌표는(N,M)

# 접근 방식

직사각형이 아닌 영역의 개수와 넓이를 구해야 하므로, 직사각형이 아닌 연결된 부분을 **bfs**로 탐색하며 넓이를 구하고 총 개수를 구할 수 있음

# 풀이

### 모눈종이, 직사각형 그리기

- 모눈 종이를 boolean 2차원 배열로 나타냄
  - MxN 모눈종이는 왼쪽 아래부터 (0,0)임.
  - x,y 좌표를 행(세로), 열(가로)로 하려면 행이 N, 열이 M이어야 함.
  - 따라서 2차원 배열은 [N][M] 크기임
  - 직사각형, 방문한 곳은 모두 갈 수 없는 곳이기 때문에 갈 수 있는 곳/없는 곳 둘로 나누기 위해 boolean으로 함
- 직사각형 왼쪽 아래 꼭짓점의 (sx,sy)와 오른쪽 위 꼭짓점의 (ex,ey)이 주어지는데 왼쪽 아래가 오른쪽 위보다 값이 작기 때문에
  - 행은 sx ~ ex
  - 열은 sy ~ ey 만큼이 직사각형의 범위임
- 직사각형 범위는 갈 수 없기 때문에 모눈종이에 true로 표시
  - true: 갈 수 없음(방문 o)
  - false: 갈 수 있음(방문 x)

### 영역의 개수, 넓이 구하기

- 모눈종이를 돌면서 방문한 적 없는 칸을 찾고
- 그 영역에 연결된 칸의 개수 == 영역의 넓이 이므로 연결된 칸을 돌면서 개수를 구해주면 됨
- 영역에 연결된 칸은 bfs로 돌면서 개수를 구해주고 그 개수를 list에 넣음
- 모눈종이를 모두 돌고난 후 list의 크기가 영역의 개수임
- 각 영역의 넓이를 오름차순으로 정렬해서 출력하기 위해 list를 정렬하고 하나씩 출력함.
