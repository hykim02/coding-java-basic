import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        int sum = 0;

        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        
        System.out.println(sum);
        sc.close();
    }
}
