// program to find odd and even numbers in the array
import java.util.*;
public class program1{
    public static void array(int nums[]){
        for(int i = 0 ; i<nums.length;i++){

        
        if (nums[i] %2 == 0) {
            System.out.println(nums[i] + " is an even number.");
        }else{
            System.out.println(nums[i] + " is an odd number.");
        }
    }
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