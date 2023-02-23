import java.util.Scanner;
//1. Check the given number is EVEN or ODD. 
public class _1EvenOrOdd{
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}