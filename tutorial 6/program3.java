class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    String usn;
    double marks;

    Student(String name, int age, String usn, double marks) {
        super(name, age);
        this.usn = usn;
        this.marks = marks;
    }
}

class Result extends Student {
    String result;

    Result(String name, int age, String usn, double marks) {
        super(name, age, usn, marks);

        if (marks >= 90)
            result = "Distinction";
        else if (marks >= 60)
            result = "First Class";
        else if (marks >= 35)
            result = "Pass";
        else
            result = "Fail";
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("USN: " + usn);
        System.out.println("Marks: " + marks);
        System.out.println("Result: " + result);
    }
}

public class program3 {
    public static void main(String[] args) {
        Result s = new Result("Mihir", 20, "4NI25CS112", 85);
        s.display();
    }
}