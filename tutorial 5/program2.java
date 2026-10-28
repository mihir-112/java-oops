// java class of mobile phone with attribute of brand , model and price

import java.util.Scanner;
class MobilePhone{
String brand;
String model;
double price;

}
public class program2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
MobilePhone phone=new MobilePhone();
System.out.print("Enter brand: ");
phone.brand=sc.nextLine();
System.out.print("Enter model: ");
phone.model=sc.nextLine();
System.out.print("Enter price: ");
phone.price=sc.nextDouble();
System.out.println("Brand: "+phone.brand);
System.out.println("Model: "+phone.model);
System.out.println("Price: ₹"+phone.price);

}
}
