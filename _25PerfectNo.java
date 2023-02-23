import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _25PerfectNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        //6 =1,2,3,=6
        //28=1,2,4,7,14,=28
        int sum=0;
        List lst=new ArrayList<>();
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            System.out.println("Number is Perfect");
        }
        else{
            System.out.println("Number is not Perfect");

        }
    }
}
