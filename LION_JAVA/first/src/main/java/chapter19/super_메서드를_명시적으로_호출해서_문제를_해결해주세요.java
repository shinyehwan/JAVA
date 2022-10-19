package chapter19;
// 문제 : 아래가 오류없이 실행되도록 해주세요.
// 조건 : 사람 클래스만 수정할 수 있습니다.

/**
 * 사람의 기본 생성자가 만들어지는데,
 * 그 생성자 안에 자동적으로 만들어지는 슈퍼가 어떤 생성자를 호출해야하는지 모른다 코드보면 두개잖아!
 * 만약, 동물의 기본 생성자가 있으면 기본생성자 실행
 */

class super_메서드를_명시적으로_호출해서_문제를_해결해주세요 {
    public static void main(String[] args) {
        new 사람();
    }
}

class 동물 {
    //    동물() {
//
//    }
    동물(String 이름) {
        System.out.println("동물(String 이름) 실행됨!");
        System.out.println("이름 : " + 이름);
    }
    동물(String 이름, int 나이) {
        System.out.println("동물(String 이름, int 나이) 실행됨!");
        System.out.println("이름 : " + 이름);
        System.out.println("나이 : " + 나이);
    }
}

class 사람 extends 동물 {
    사람() {
        super("사람");
    }

}