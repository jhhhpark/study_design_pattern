# 소개
---
## 데코레이터 패턴
- 객체에 추가 요소를 동적으로 더할 수 있으며, 데코레이터를 사용하면  
서브클래스를 만드는 경우에 비해 훨씬 유연하게 기능을 확장 가능하다.

---

### 특징

#### 장점
----
- 데코레이터 패턴에서는 구상 구성요소를 감싸주는 데코레이터를 사용한다.
- 데코레이터 클래스의 형식은 그 클래스가 감싸고 있는 클래스의 형식을 반영한다.
(상속, 인터페이스 구현을 통해 자신이 감싸고 있는 클래스와 동일한 형식을 지님)
- 자기가 감싸고 있는 구성요소의 메소드를 호출한 결과에 새로운 기능을 더함으로써 행동을 확장함.
- 데코레이터의 개수 제한이 없다

#### 단점
-----
- 구성요소의 클라이언트 입장에서는 데코레이터의 존재를 알 수 없음. 구성요소의 구체적인 형식에 의존하게 되는 경우는 예외임.
- 데코레이터 패턴을 사용하면 자잘한 객체들이 매우 많이 추가될 수 있고, 데코레이터를 너무 많이 사용하면 코드가
필요 이상으로 복잡해질 수 있음.
