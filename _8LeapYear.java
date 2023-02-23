import java.util.Scanner;

public class _8LeapYear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        if(num%400 ==0 &&  num%4==0 || num%100!=0 ){
            System.out.println("this is Leap Year");
        }
        else{
            System.out.println("This is not Leap Year");
        }
    }
}