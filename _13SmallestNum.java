import java.util.Scanner;

public class _13SmallestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1");
        int num1=sc.nextInt();
        System.out.println("Enter Number2");
        int num2=sc.nextInt();
        System.out.println("Enter Number3");
        int num3=sc.nextInt();

        //10 2 8
        if(num1>num2){
            if(num2>num3){
                System.out.println("small number is: "+num3);
            }
            else{
                System.out.println("small number is: "+num2);
            }
        }
        else{
            if(num1>num3){
                System.out.println("small number is: "+num3);
            }
            else{
                System.out.println("small number is: "+num1);
            }
        }
    }
}
