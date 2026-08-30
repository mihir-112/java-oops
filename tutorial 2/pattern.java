public class pattern{
    public static void pattern1(){
        System.out.println(" * * * * ");
    }
    public static void pattern2(){
        for(int i = 0 ; i < 3 ; i++){

            System.out.println(" * * * * ");
        }
    }
    public static void pattern3(){
        for(int i = 0 ;  i < 3; i ++){
          System.out.println((i+1) +" " + (i+4) +" "+ (i+7));
        }
    }
    public static void main(String[] args) {
       pattern1(); 
       pattern2();
       pattern3();
    }
}