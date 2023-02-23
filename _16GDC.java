import java.util.Scanner;

//16. Write a Java Program to find GCD of two given numbers. 
public class _16GDC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1");
        int num1=sc.nextInt();
        System.out.println("Enter Number2");
        int num2=sc.nextInt();

        if(num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        /*
         15
         40
         40/15=2->10
         15/10=1->5
         10/5=0
         ans is 5

         26
         48
         48/26=1->22
         26/22=1->4
         22/4=5->2
         4/2=2->0
         2

         24
         36
         36/24=1->12
         24/12=2->0
         12
         */
        int rem=num2;
        while(rem!=0){
            num2=rem;
            rem=num1%num2;
            num1=num2;
        }
        System.out.println(num2);

    }
}
