import java.util.Scanner;
//6. Swap two numberswithout using third variable approach 3. 
public class _6SwapNo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        System.out.println("before swap num1: "+num1+" num2:"+num2);
        //bitwise XOR
        //num1=10=01010
        //num2=15=01111
        //a=a^b=0101=10

      
        num1 = num1 ^ num2;//0101=5
        //0101^1111
        num2 = num1 ^ num2;//1010=10
        //0101^1010
        num1 = num1 ^ num2;//=1111=15

        System.out.println("after swap num1: "+num1+" num2:"+num2);
    }
}
