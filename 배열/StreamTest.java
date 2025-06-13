import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        // 스트림 생성
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);

        stream.forEach(System.out::println);

        String str = "ABC";
        String l = str.toLowerCase();
        System.out.println(str);
        System.out.println(l);
        System.out.println(str.substring(1));
        System.out.println(str.substring(0, 2));
    }
}
