import java.util.Scanner;

public class HackPat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,b;
        if(n%2!=0){
            a=(n-1)/2;
            b=3*n/2-1;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i+j==a || i-j==a || j-i==a || i+j==b || i==a || j==a){
                        System.out.print("*");
                        
                    }
                    else{
                        System.out.print(" ");
                    }
                   
                }
                System.out.println();
            }
        }
    }
}
