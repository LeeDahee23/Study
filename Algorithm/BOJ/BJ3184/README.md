```
⭕️, bfs
양의 수가 많으면 양만 남고, 늑대의 수가 많으면 늑대만 남음
```

# 문제

'.'은 빈 필드, '#'는 울타리, 'o'는 양 'v'는 늑대를 의미한다.
직사각형 모양의 마당에서 수평, 수직으로만 이동해서 울타리를 제외한 다른 칸으로 이동할 수 있다.
영역 안의 양의 수가 늑대의 수보다 많아지면 늑대를 우리에서 쫒아내고, 그렇지 않다면 늑대가 양을 모두 잡아먹을 때 살아남은 양과 늑대의 수를 출력하는 프로그램을 작성하시오.

- 3 <= 행, 열의 수 <= 250

# 풀이

수평, 수직으로 이동해서 이동할 수 있는 영역에서 양의 수와 늑대의 수를 비교해 누가 이기는지를 보며 이긴 편의 수를 구하면 된다.

- 수평, 수직으로 이동: dx, dy
- 방문처리를 위해 boolean[][] visited를 만들고
  - 울타리(#)는 방문할 수 없는 곳이기 때문에 울타리 위치의 visited를 true로 한다.
- board를 돌면서 방문한 적 없는 위치에서부터 이동할 수 있는 영역을 돌면서 양과 늑대의 수를 각각 구한다: bfs
  - 영역을 탐색하는 거니까 bfs or dfs
- 구한 양과 늑대의 수를 비교해 양이 더 많다면 양의 수를 전체 양의 수에 더하고, 늑대가 더 많다면 전체 늑대의 수에 늑대 수를 더한다.
- 만약 둘 다 0마리라면 해당 영역은 넘어간다.
