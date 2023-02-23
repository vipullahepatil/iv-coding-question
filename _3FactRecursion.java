import java.util.Scanner;

public class _3FactRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Number");
        System.out.println(FactRec(sc.nextInt()));
    }
    public static int FactRec(int num){
        int fact=1;
        if(num<=0){
            return fact;
        }
        if(num==1){
            return 1;
        }
        else{
            fact=num*FactRec(--num);
        }
        return fact;
    }
    
    
}
