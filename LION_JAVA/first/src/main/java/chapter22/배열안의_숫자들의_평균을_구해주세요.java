package chapter22;

class 배열안의_숫자들의_평균을_구해주세요 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

		/*
		// 아래 4줄은 위 1줄과 같은 의미 입니다.
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		*/
        System.out.println(arr.length);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum / arr.length);


    }
}