import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        // 스트림 생성성
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);

        stream.forEach(System.out::println);
    }
}
