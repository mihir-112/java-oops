class Vehicle {
    int cc;
    double mileage;
    double cost;

    Vehicle(int cc, double mileage, double cost) {
        this.cc = cc;
        this.mileage = mileage;
        this.cost = cost;
    }
}

class Bike extends Vehicle {
    double tax;
    double totalCost;

    Bike(int cc, double mileage, double cost) {
        super(cc, mileage, cost);
        tax = cost * 0.10;
        totalCost = cost + tax;
    }

    void display() {
        System.out.println("CC: " + cc);
        System.out.println("Mileage: " + mileage);
        System.out.println("Cost: " + cost);
        System.out.println("Tax: " + tax);
        System.out.println("Total Cost: " + totalCost);
    }
}

public class program2 {
    public static void main(String[] args) {
        Bike b = new Bike(150, 45.5, 120000);
        b.display();
    }
}