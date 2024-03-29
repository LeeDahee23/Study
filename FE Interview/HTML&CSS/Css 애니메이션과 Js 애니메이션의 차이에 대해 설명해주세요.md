## CSS 애니메이션

#### 개념

- @keyframes 로 간단하게 처리하는 애니메이션으로 브라우저가 자동으로 최적화함
- 복잡한 인터랙션에 대한 제어는 제한적

#### 특징

- 외부 라이브러리가 필요하지 않음
- 미디어쿼리를 사용해서 반응형으로 애니메이션 가능
- 메인스레드가 아닌 별도의 컴포지터 스레드에서 그려지기 때문에 메인 스레드에서 작업하는 JS보다 효율적

## JS 애니메이션

#### 개념

- JS 코드를 사용해 css로 처리하기에는 훨씬 복잡하고 무거운 애니메이션 작업들을 효율적이고 세밀하게 다룰 수 있음
- 사용자의 입력이나 다른 이벤트에 따라 동적으로 애니메이션 변경 가능

#### 특징

- JS 애니메이션은 복잡한 계산이 필요할 때 더 높은 리소스를 소모할 수 있음. 그러나 최신 브라우저에서는 JavaScript 엔진의 최적화로 인해 성능 차이가 과거에 비해 많이 줄어들었음.
- 계속해서 요소의 위치를 재계산해야 하기 때문에 (reflow) 성능이 css에 비해 떨어짐.

## 꼬리질문

- JavaScript 애니메이션을 사용할 때 성능 문제를 어떻게 해결할 수 있나요?
  - reflow와 repaint 최소화
  - requestAnimationFrame 사용
  - 웹 워커 활용
  - throttling과 debouncing

## 참고

- https://velog.io/@hoho_0815/CSS-%EC%95%A0%EB%8B%88%EB%A9%94%EC%9D%B4%EC%85%98%EA%B3%BC-JS-%EC%95%A0%EB%8B%88%EB%A9%94%EC%9D%B4%EC%85%98%EC%9D%98-%EC%B0%A8%EC%9D%B4%EC%A0%90
