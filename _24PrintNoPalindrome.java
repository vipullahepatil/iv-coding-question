import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _24PrintNoPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        int oNum=num;
        int count=0;
        //153
        //1+125+27=153
       for(int i=1;i<=num;i++){
        isPalindrome(i);
       }
       
    }
    public static void isPalindrome(int num){
        int oNum=num;
        List<Integer> lst=new ArrayList<>();  
        int count=0;    
        while(num!=0){
            lst.add(num%10);
            num=num/10;
            count++;
        }
        int sum=0;
        for (int obj : lst) {
            sum=sum+(int)Math.pow(obj,count);
        }
        if(oNum==sum){
            System.out.print(oNum+" ");
        }
        
    }
}

