package chapter19;

import java.util.stream.Stream;

public class 덧셈으로_이루어진_다항식을_스트림을_통해서_계산하기 {
    public static void main(String[] args) {
        int rs = Stream.of("30 + 40 + 20 + 40 + 20 + 50 + 11 + -6  + -100".split(" \\+ "))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println(rs);
    }
}

