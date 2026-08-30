
import java.util.*;
public class simple_cal {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char operator=sc.next().charAt(0);
        switch (operator) {
            case '+' :System.out.println("The sum of a and b is : " + (a+b));
             break;
            case '-':System.out.println("The sub is : " + (a-b));
            break;
            case '*':System.out.println("The product is : " + (a*b));
            break;
            case '/':System.out.println("The div is : " + (a/b));
            break;
            case '%':System.out.println("The remainder is : " + (a%b));
            break;
            default: System.out.println("INVALID INPUT");
        
        }
        sc.close();
    }
}
