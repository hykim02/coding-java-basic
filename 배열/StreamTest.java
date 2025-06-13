import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        // 스트림 생성
        // String[] arr = new String[]{"a", "b", "c"};
        // Stream<String> stream = Arrays.stream(arr);

        // stream.forEach(System.out::println);

        // String str = "ABC";
        // String l = str.toLowerCase();
        // System.out.println(str);
        // System.out.println(l);
        // System.out.println(str.substring(1));
        // System.out.println(str.substring(0, 2));

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] arr = {{2,5,3}, {4,4,1}, {1,7,3}};
        System.out.println("arr.length:" + arr.length);
        System.out.println("arr[0].length:" + arr[0].length);

        for(int i=0; i < arr.length; i++) {
            System.out.println("arr[i][0]:" + arr[i][0]);
        }

        int[] array2 = Arrays.copyOfRange(array, 2, 4);
        for(int a : array2) {
            System.out.println(a);
        }

        Arrays.sort(array);
        for(int i:array) {
            System.out.println(i);
        }

        
    }
}
