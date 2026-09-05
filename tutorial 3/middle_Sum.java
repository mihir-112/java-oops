import java.util.Scanner;

public class middle_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        n = n/10;
       int sum = 0 ;
       while (n!=0) {
        if (n >=10) {

            sum = sum +n%10;
        }
        n = n/10;
       }

        System.out.println("Sum of middle digits = " + sum);
    }
}
