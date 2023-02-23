import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11AllFactorOfNumber {

//11. Write a Java Program to print all the Factors of the Given number.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();

        //26
        //2*
        List no=new ArrayList();     
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                no.add(i);
            }
        }
        no.add(num);
        System.out.println(no);
     
    }
}
