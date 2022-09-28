# java
## 기본
- 변수
```
System.out.prinln("x : " + 10 + 5)
                  "x : " + "10" + 5
                  "x : 10" + 5
                  "x : 10" + "5"
                  "x : 105"
변수, 변수가 아닌것을 구분할 줄 알아야함.
```


- 함수
- 조건문
- 반복문
## 특징
- 클래스
- 객체
- 상속
- 인터페이스 .....

### 클래스와 객체
- 모든 변수는 메모리에 저장된다.
- int 변수는 4바이트 이다.
- 변수에는 오직 8바이트 이하의 값만 넣을 수 있다.
- 객체가 필요한 이유
  - 변수에는 오직 값 1개만 넣을 수 있다.
  - 프로그래밍을 하다보면 변수에 값을 여러개 넣을 필요가 있을 때가 있다.
  - 그래서 고안된 것이 객체이다.
  - 객체는 커피 캐리어에 비유될 수 있다.
  - 커피 캐리어에는 커피를 여러잔 담을 수 있다.
  - 커피 캐리어는 용도에 따라 종류가 여러가지 있다.
  - 프로그래밍을 할 때 상황에 따라 서로 다른 종류의 객체 여러개가 필요하다.
  - 객체를 일종의 제품으로 보았을 때 객체를 만들기 위해서는 설계도 즉 클래스가 필요하다.
  - 객체는 너무 커서 변수에 담을 수 없다.
  - 그래서 또 고안된 것이 리모콘 시스템이다.
  - 클래스로는 3가지를 할 수 있다.
  - 클래스로는 객체도 만들 수 있고 그 객체를 조종할 수 있는 리모콘도 만들 수 있다. 그리고 또 객체리모콘을 담을 변수도 만들 수 있다.
- 변수에는 오직 1차원적인 값만 저장 할 수 있다.
  - 1차원 적인 값(데이터)
    - 5
    - 3.14
    - 'a'
    - true
  - 복잡한 값
    - 객체
- 변수에는 객체를 저장할 수 없다.
  - 객체가 너무 크고 변수는 작다.
  - 객체는 여러가지 값(데이터)의 조합이다. 그게 변수에 들어가면 한 덩어리로 해석된다.
  - 즉 변수에 1과 2를 넣으면, 다른 사람들은 그것을 1과 2의 조합이 아닌 12로 본다.
- **new 사람();** 을 하면 2가지가 만들어진다.
  - 객체
  - 객체가 자기자신을 조종할 수 있는 리모콘
    - 그 리모콘을 객체 스스로는 this 라고 부른다.
