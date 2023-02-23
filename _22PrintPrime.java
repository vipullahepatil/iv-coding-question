import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class _22PrintPrime {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();       
        Set lst=new LinkedHashSet<>();
        for(int i=2;i<=num;i++){
           if(isPrime(i)){
            lst.add(i);
           }
        }
        System.out.println(lst);
    }

}
