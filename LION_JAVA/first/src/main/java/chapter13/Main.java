package chapter13;

// 힌트 : if ( a무기 == null ) { ... }

class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();
        a전사.공격();
        // 출력 => 아직 무기가 없습니다.
        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 => 칼로 공격합니다.
    }
}
class 전사 {
    int 나이;
    무기 a무기;

    void 공격() {
        if ( a무기 == null ) {
            System.out.println("아직 무기가 없습니다.");
            return; // 입구 컷
        }
        a무기.작동(); //  if else 보다 if return 이 더 좋은 이유, 되도록 입구컷 합시다
    }
}

class 무기 {
    void 작동() {
    }
}

class 칼 extends 무기 {
    void 작동() {
        System.out.println("칼로 공격합니다.");
    }
}




