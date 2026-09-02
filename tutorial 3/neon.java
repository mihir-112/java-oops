import java .util.*;

public class neon {

    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int sq = num*num;
        int temp = num ;
        int sum = 0 ;

        while (temp>0) {
            sum += temp%10;
            temp/= 10;
        }
        if (num == sum ) {
            System.out.println( num + " is  a neon number");
        }else{
            System.out.println(num + " is not a neon number .");
        }
    }
}