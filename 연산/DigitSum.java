import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;

        // while (n > 0) {
        //     sum += n % 10;
        //     n = n / 10;
        // }

        // System.out.println(sum);
        // sc.close();


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
    }
}
