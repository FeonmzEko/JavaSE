package stream;

import java.util.stream.Stream;

public class Demo5 {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7).forEach(s-> System.out.println(s));
        Stream.of('a','c','g').forEach(s-> System.out.println(s));
    }
}
