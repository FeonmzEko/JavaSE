package stream;

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.stream.Stream;

public class Demo4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        Arrays.stream(arr).forEach(s-> System.out.println(s));
        Stream.of(arr).forEach(System.out::println);

    }
}
