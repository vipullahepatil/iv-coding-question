import java.util.Scanner;

public class _5SwapNo2 {
    //5. Swap two numberswithout using third variable approach 2. 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        System.out.println("before swap num1: "+num1+" num2:"+num2);
        //10
        //15
        //1=> 15*10=150
        //1=150 2=15
        //2=>150/15=10;
        //1=150 2=10
        //1=150/10=15
        //
        num1=num1*num2;
        num2=num1/num2;
        num1=num1/num2;

        System.out.println("after swap num1: "+num1+" num2:"+num2);
    }
}
