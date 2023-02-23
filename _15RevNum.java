import java.util.Scanner;

public class _15RevNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        String s=Integer.toString(num);
        String rv="";
        for(int i=s.length()-1;i>=0;i--){
            rv=rv+s.charAt(i);
        }
        System.out.println(rv);

    }
}