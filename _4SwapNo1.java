import java.util.Scanner;
//4. Swap two numberswithout using third variable approach 1. 
public class _4SwapNo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();

        System.out.println("Before num1: "+num1+" num2"+num2);
        num2=num2-num1;//5
        num1=num1+num2;//15
        num2=num1-num2;//10

        System.out.println("Before num1: "+num1+" num2"+num2);

       

    }
   
}
