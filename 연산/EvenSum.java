import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        // for (int i = 1; i <= n; i++) {
        //     if (i % 2 == 0) {
        //         sum += i;
        //     }
        // }

        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        System.out.println(sum);
        sc.close();
    }    
}
