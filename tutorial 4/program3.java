// program to find the sum and average of elements in the array 
import java.util.*;
public class program3{
   
    public static void array(int nums[]){
        int sum = 0 ; 
        int average = 0 ; 
        
        for(int i = 0 ; i<nums.length;i++){
            sum = sum+ nums[i];
            average = sum /nums.length;
    }
    System.out.println("Sum of  elements in the array is : " + sum);
    System.out.println("Sum of  elements in the array is : " + average);
}
 
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in) ;
       System.out.print("Enter the size of array :");
       int n = sc.nextInt();

       int nums [] = new int [n];
       for(int i = 0 ; i <n ;  i++){
        System.out.print("Enter " + (i+1) + " Element: ");
        nums[i] = sc.nextInt();
       }
       array(nums);
     
       sc.close();
    }
}