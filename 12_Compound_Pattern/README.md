# Compound Pattern
---

## 특징
1. 모델 뷰 컨트롤러 패턴(MVC)은 옵저버 패턴, 스트래티지 패턴, 컴포지트 패턴으로 이루어진 컴파운드 패턴이다.
2. 모델에서는 옵저버 패턴을 이용하여 옵저버들에 대한 의존성은 없애면서도 옵저버들한테 자신의 상태가 변경되었음을 알릴 수 있다.
3. 컨트롤러는 뷰에 대한 전략 객체이다. 뷰에서는 컨트롤러를 바꾸기만 하면 다른 행동을 활용할 수 있다.
4. 뷰에서는 컴포지트 패턴을 이용하여 사용자 인터페이스를 구현한다. 보통 패널이나 프레임, 버튼과 같은 중첩된 구성요소로 구성된다.
5. 모델과 뷰, 컨트롤러는 이 세 패턴을 통해서 서로 연결된다. 상대방에 대해 느슨하게 결합되기 때문에 깔끔하면서도 유연하게 구현 할 수 있다.
6. 새로운 모델을 기존의 뷰 및 컨트롤러하고 연결해서 쓸 때는 어댑터 패턴을 활용하면 된다.
7. 모델 2는 MVC를 웹 애플리케이션에 맞게 적용한 디자인이라고 할 수 있다.
8. 모델 2에서 컨트롤러는 서블릿으로 구현되며 뷰는 JSP/HTML로 구현된다.

---
구성|내용
--|--
Compound Pattern|두 개 이상의 패턴을 결합하여 일반적으로 자주 등장하는 문제들에 대한 해법을 제공한다.
