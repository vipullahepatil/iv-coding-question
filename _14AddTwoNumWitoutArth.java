import java.util.Scanner;

public class _14AddTwoNumWitoutArth {
    //14. How to add two numbers without using the arithmetic operators in Java? 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1");
        int num1=sc.nextInt();
        System.out.println("Enter Number2");
        int num2=sc.nextInt();

        if(num1>num2){
            for(int i=1;i<=num1;i++){
                num2++;
            }
            System.out.println(num2);
        }
        else{
            for(int i=1;i<=num2;i++){
                num1++;
            }
            System.out.println(num1);
        }
    }
}
