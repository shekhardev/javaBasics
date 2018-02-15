package streams.example;

import java.util.stream.IntStream;

public class JavaStreams {
    public static void main(String[] args) {

        IntStream
                .range(1,5)
                .sum();

        System.out.println();
    }
}
