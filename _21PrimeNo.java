import java.util.Scanner;

public class _21PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        boolean flag=false;      
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=true;
            }
        }
        if(flag){
            System.out.println("Number is not prime");
        }
        else{
            System.out.println("Number is prime");
        }
    }
}
