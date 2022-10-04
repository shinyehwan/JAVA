package chapter13;

class Main2 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.a무기1 = new 칼();
        a전사.공격();
        // 출력 => 전사가 칼로 공격합니다.

        a전사.a무기1 = new 활();
        a전사.공격();
        // 출력 => 전사가 활로 공격합니다.

        a전사.a무기2 = new 칼();
        a전사.공격();
        // 출력 => 전사가 활로 공격합니다.
        // 출력 => 전사가 칼로 공격합니다.
    }
}
class 전사 {
    int 나이;
    무기 a무기1;
    무기 a무기2;

    void 공격() {
        if ( a무기1 != null ) {
            System.out.print("전사가 ");
            a무기1.작동();
        }

        if ( a무기2 != null ) {
            System.out.print("전사가 ");
            a무기2.작동();
        }
    }
}
class 무기 {
    void 작동() {}
}
class 칼 extends 무기 {
    void 작동() {
        System.out.println("칼로 공격 합니다.");
    }
}
class 활 extends 무기 {
    void 작동() {
        System.out.println("활로 공격 합니다.");
    }
}














