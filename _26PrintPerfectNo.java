import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _26PrintPerfectNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            printPerfectNo(i);
        }
    }
    public static void printPerfectNo(int num){
        int sum=0;
        List lst=new ArrayList();
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            System.out.print(num+" ");
        }
        
    }
}
