import java.util.Scanner;

public class Hack2 {
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        
        int num1=Integer.parseInt(num);  
        System.out.println("num1 first"+num1); 
        int sum1=num1;    
        while(sum1<=9){           
            sum1=0;
            num1=sum1;         
            while(num1!=0){
           
            sum1=sum1+(num1%10)*(num1%10);
            num1=num1/10;
            System.out.println("sum:"+sum1);
            System.out.println("num:"+num1);
           }
          
        }
        if(sum1==1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
