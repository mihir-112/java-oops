
public class counting {
    public static void counting1(){
        int n= 1 ;
        while(n <= 5){
            System.out.println(n);
            n++;
        }
    }
    public static void counting2(){
        int n= 1  ;
      do { 
        System.out.println(n);
        n++ ; 
      } while (n <= 5);

    }
    public static void main (String [] args ){
        counting1();
        counting2();
    }
    
}
