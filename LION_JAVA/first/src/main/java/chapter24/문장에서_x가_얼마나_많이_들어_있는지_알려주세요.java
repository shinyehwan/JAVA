package chapter24;

class 문장에서_x가_얼마나_많이_들어_있는지_알려주세요 {
    public static void main(String[] args) {
        String str = "axslekjxxlkzjxkljxxXXXssjxxXXxxX";

        int xCount = 0;

        for ( int i = 0; i < str.length(); i++ ) {
            if ( str.charAt(i) == 'x' || str.charAt(i) == 'X' )
            {
                xCount++;
            }
        }

        System.out.println("xCount : " + xCount);
    }
}