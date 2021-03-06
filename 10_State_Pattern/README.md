# State Pattern
---

## 특징
1. 스테이트 패턴을 이용하면 내부 상태를 바탕으로 여러 가지 서로 다른 행동을 사용할 수 있다.
2. Context객체에서 현재 상태에게 행동을 위임한다.
3. 스테이트 패턴을 이용하면 일반적으로 행동 또는 알고리즘은 Context 클래스를 만들 때 설정한다.
4. 상태 전환은 State 클래스에 의해서 제어할 수도 있고, Context 클래스에 의해서 제어할 수도 있다.
5. State 클래스를 여러 Context객체의 인스턴스에서 공유하도록 디자인 할 수도 있다.


---
구성|내용
--|--
State Pattern|내부 상태가 바뀜에 따라 객체의 행동이 바뀔 수 있도록 해 준다. 마치 객체의 클래스가 바뀌는 것 같은 결과를 얻을 수 있다.
