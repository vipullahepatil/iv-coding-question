import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _20PrimeFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();

        List pm=new ArrayList<>();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                pm.add(i);
            }
        }
        System.out.println("prime factor :"+pm);
    }
}
