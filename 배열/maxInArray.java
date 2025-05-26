import java.util.Scanner;

public class maxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i]
            }
        }
        System.out.println(max);
        sc.close();
    }
}
