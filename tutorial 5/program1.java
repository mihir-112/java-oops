//class and object to store and display student information 

import java.util.Scanner;

public class program1 {
    static class Student {
        String name;
        int age;
        String usn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.print("Enter student name: ");
        s1.name = sc.nextLine();
        System.out.print("Enter student age: ");
        s1.age = sc.nextInt();
        System.out.print("Enter student USN: ");
        s1.usn = sc.nextLine();
        System.out.println("Student Information: ");
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("USN : " + s1.usn);
    }
}



