// program to find the largest and smallest numbers in the array 
import java.util.*;
public class program4{
   
    public static void array(int nums[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE ; 
        
        for(int i = 0 ; i<nums.length;i++){
          if (nums[i] > largest) {
            largest = nums[i];
          }
          if (nums[i] < smallest){
            smallest = nums[i];
          }
        }
        System.out.println("largest elements in the array is : " + largest);
        System.out.println("Smallest  elements in the array is : " + smallest );
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