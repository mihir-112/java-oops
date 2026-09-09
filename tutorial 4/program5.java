// program for linear search
import java.util.*;
public class program5{
   
    public static void array(int nums[] , int n ){
        boolean found = false;
        for(int i = 0 ; i <nums.length ;i++){
            if(nums[i] == n){
               found = true;
                System.out.println(n + " is  found in the array at index : " + i);
 
            }
        }
        if (found == false ) {
            System.out.println(n + " is not found in the array");
        } 
    }

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in) ;
       System.out.print("Enter the size of array :");
       int n = sc.nextInt();
       System.out.print("Enter the Key to search:");
        int key = sc.nextInt();


       int nums [] = new int [n];
       for(int i = 0 ; i <n ;  i++){
        System.out.print("Enter " + (i+1) + " Element: ");
        nums[i] = sc.nextInt();
       }
       array(nums,key);
     
       sc.close();
    }
}