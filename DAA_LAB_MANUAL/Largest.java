package DAA_LAB_MANUAL;
public class Largest {
    public static void main(String[] args) {
        int num1 = 114;
        int num2 = 10;
        int num3 = 15;
        if(num1 > num2){
          if(num1 > num3){
            System.out.println("The largest number is " + num1);
          }  
        }
        else{

         if(num2 > num3){
            System.out.println("The largest number is "+ num2);
        }
        else{
            System.out.println("The largest number is "+ num3);
            }  
        }
    }
}
