// program to find number of odd and even numbers in the array
import java.util.*;
public class program2{
   
    public static void array(int nums[]){
        int even = 0 ; 
        int odd = 0 ;
        for(int i = 0 ; i<nums.length;i++){

        
        if (nums[i] %2 == 0) {
            even ++;
        }else{
            odd++;
        }
    }
    System.out.println("Number of even elements in the array is : " + even);
    System.out.println("Number of odd elements in the array is : " + odd);
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