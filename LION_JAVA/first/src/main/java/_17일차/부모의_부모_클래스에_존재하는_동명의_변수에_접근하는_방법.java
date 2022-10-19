package _17일차;

public class 부모의_부모_클래스에_존재하는_동명의_변수에_접근하는_방법 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        생물 a생물 = a사람;
        동물 a동물 = a사람;

        a생물.이름 = "생물이름";
        a동물.이름 = "동물이름";
        a사람.이름 = "사람이름";

        a사람.test();
    }

}

class 생물 {
    String 이름;
}

class 동물 extends 생물 {
    String 이름;

    String get이름() {
        return super.이름;
    }

}

class 사람 extends 동물 {
    String 이름;

    void test() {
        System.out.println(get이름());
    }
}
