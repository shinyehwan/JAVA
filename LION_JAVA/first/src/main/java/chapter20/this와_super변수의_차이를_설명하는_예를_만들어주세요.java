package chapter20;

// 문제 : 아래와 같이 출력 되도록 전사A, 전사B를 만들어주세요.
// 조건 : this와 super를 활용해주세요.

class this와_super변수의_차이를_설명하는_예를_만들어주세요 {
    public static void main(String[] args) {
        전사A a전사A = new 전사A();
        a전사A.이름 = "홍길동";

        System.out.println("== 전사A 공격(); ==");
        a전사A.공격();
        // 출력
        // 홍길동이(가) 공격!
        // 사람이(가) 숨쉬다.

        System.out.println("\n== 전사A 공격2(); ==");
        a전사A.공격2();
        // 홍길동이(가) 공격!
        // 사람이(가) 숨쉬다.

        전사B a전사B = new 전사B();
        a전사B.이름 = "홍길순";

        System.out.println("\n== 전사B 공격(); ==");
        a전사B.공격();
        // 홍길순이(가) 공격!
        // 전사B가 숨쉬다.

        System.out.println("\n== 전사B 공격2(); ==");
        a전사B.공격2();
        // null이(가) 공격!
        // 사람이(가) 숨쉬다.
    }
}

class 사람 {
    String 이름;

    void 숨쉬다() {
        System.out.println("사람이(가) 숨쉬다.");
    }
}

class 전사A extends 사람 {
    // 전사A에는 이름속성이 없다.
    // 사람클래스에서 가져온 이름 속성은 있다.
    // 이때의 `this.이름`은 사람클래스의 이름을 의미한다.
    // 이때의 `super.이름`은 사람클래스의 이름을 의미한다.

    void 공격() {
        System.out.println(this.이름 + "이(가) 공격!");
        this.숨쉬다(); // 가장 우선순위가 높은 `숨쉬다` 메서드를 사용, 즉 사람 클래스의 `숨쉬다` 메서드를 사용
    }

    void 공격2() {
        System.out.println(super.이름 + "이(가) 공격!"); // 부모 클래스에서 받은 이름에는 아직 아무 값도 없다.
        super.숨쉬다(); // 자신이 가지고 있는 `쉼쉬다` 메서드 중에서 전사A에서 직접 만든 `숨쉬다` 메서드를 제외한 것 중에서 가장 우선순위가 높은것을 사용
    }
}

class 전사B extends 사람 {
    String 이름;
    // 전사B에는 이름속성이 있다.
    // 사람클래스에서 가져온 이름 속성도 있다.
    // 이때의 `this.이름`은 전사B의 이름을 의미한다.
    // 이때의 `super.이름`은 사람클래스의 이름을 의미한다.

    // 부모가 물려진 `쉼쉬다` 메서드가 있지만 하나를 더 만드는 행위 => 오버라이드
    // 이 메서드는 부모의 `숨쉬다` 메서드보다 우선순위가 높다.
    void 숨쉬다() {
        System.out.println("전사B이(가) 숨쉬다.");
    }

    void 공격() {
        System.out.println(this.이름 + "이(가) 공격!");
        this.숨쉬다(); // 가장 우선순위가 높은 `숨쉬다` 메서드를 사용, 즉 전사B 클래스의 `숨쉬다` 메서드를 사용
    }

    void 공격2() {
        System.out.println(super.이름 + "이(가) 공격!"); // 부모 클래스에서 받은 이름에는 아직 아무 값도 없다.
        super.숨쉬다(); // 자신이 가지고 있는 `쉼쉬다` 메서드 중에서 전사B에서 직접 만든 `숨쉬다` 메서드를 제외한 것 중에서 가장 우선순위가 높은것을 사용
    }
}