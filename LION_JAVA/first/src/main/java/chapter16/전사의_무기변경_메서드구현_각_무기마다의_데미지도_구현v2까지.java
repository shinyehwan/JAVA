package chapter16;

// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : 조건문을 사용하지 않고 처리해주세요.
// 조건 : `a무기` 인스턴스 변수를 이용해서 풀어주세요.
// 조건 : 칼, 창, 지팡이 클래스를 만들어주세요.

class 전사의_무기변경_메서드구현_각_무기마다의_데미지도_구현v2까지 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격();
        // 칼(으)로 공격합니다.
        // 데미지 : 78

        a전사.창_모드로_변경();

        a전사.공격();
        // 창(으)로 공격합니다.
        // 데미지 : 80

        a전사.지팡이_모드로_변경();

        a전사.공격();
        // 지팡이(으)로 공격합니다.
        // 데미지 : 12
    }

}
// V1
//class 전사 {
//    무기 a무기;
//
//    전사() {
//        칼_모드로_변경();
//    }
//
//    void 공격() {
//        a무기.사용();
//    }
//
//    void 창_모드로_변경() {
//        a무기 = new 창();
//    }
//
//    void 칼_모드로_변경() {
//        a무기 = new 칼();
//    }
//
//    void 지팡이_모드로_변경() {
//        a무기 = new 지팡이();
//    }
//}
//
//abstract class 무기 {
//    abstract void 사용();
//}
//
//class 칼 extends 무기 {
//    void 사용() {
//        System.out.println("칼(으)로 공격합니다.");
//        System.out.println("데미지 : 78");
//    }
//}
//
//class 창 extends 무기 {
//    void 사용() {
//        System.out.println("창(으)로 공격합니다.");
//        System.out.println("데미지 : 80");
//    }
//}
//
//class 지팡이 extends 무기 {
//    void 사용() {
//        System.out.println("지팡이(으)로 공격합니다.");
//        System.out.println("데미지 : 12");
//    }
//}

//V2
class 전사 {
    무기 a무기;

    전사() {
        a무기 = new 칼();
    }

    void 공격() {
        a무기.사용();
    }

    void 창_모드로_변경() {
        a무기 = new 창();
    }

    void 지팡이_모드로_변경() {
        a무기 = new 지팡이();
    }
}

class 무기 {
    String 이름;
    int 데미지;

    void 사용() {
        System.out.println(이름 + "(으)로 공격합니다.");
        System.out.println("데미지 : " + 데미지);
    }
}

class 칼 extends 무기 {
    칼() {
        이름 = "칼";
        데미지 = 78;
    }
}

class 창 extends 무기 {
    창() {
        이름 = "창";
        데미지 = 80;
    }
}

class 지팡이 extends 무기 {
    지팡이() {
        이름 = "지팡이";
        데미지 = 12;
    }
}


//V3
//class 전사 {
//    무기 a무기;
//
//    전사() {
//        a무기 = new 칼();
//    }
//
//    전사(무기 a무기) {
//        a무기 = a무기;
//    }
//
//    void 공격() {
//        a무기.사용();
//    }
//
//}
//
//class 무기 {
//    String 이름;
//    int 데미지;
//
//    void 사용() {
//        System.out.println(이름 + "(으)로 공격합니다.");
//        System.out.println("데미지 : " + 데미지);
//    }
//}
//
//class 칼 extends 무기 {
//    칼() {
//        이름 = "칼";
//        데미지 = 78;
//    }
//}
//
//class 창 extends 무기 {
//    창() {
//        이름 = "창";
//        데미지 = 80;
//    }
//}
//
//class 지팡이 extends 무기 {
//    지팡이() {
//        이름 = "지팡이";
//        데미지 = 12;
//    }
//}


