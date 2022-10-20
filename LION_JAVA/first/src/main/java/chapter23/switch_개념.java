package chapter23;

class switch_개념 {
    public static void main(String[] args) {
        계절변환기 a = new 계절변환기();
        for ( int month = 1; month <= 12; month++ ) {
            String 계절 = a.get계절(month);
            System.out.println(month + "월은 " + 계절 + " 입니다.");
        }
    }
}
class 계절변환기 {
    String get계절(int month) {
        String 계절 = "";

        switch ( month ) {
            case 3:
            case 4:
            case 5:
                계절 = "봄";
                break;
            case 6:
            case 7:
            case 8:
                계절 = "여름";
                break;
            case 9:
            case 10:
            case 11:
                계절 = "가을";
                break;
            default:
                계절 = "겨울";
                break;
        }

        return 계절;
    }
}



