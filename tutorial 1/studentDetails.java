import java.util.*;
public class studentDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the age :");
        int age = sc.nextInt();
        System.out.print("Enter the marks :");
        int marks = sc.nextInt();
        System.out.println("Name:" + name);
        System.out.println("Age :" + age);
        System.out.println("Marks:" + marks);
        sc.close();
    }
}