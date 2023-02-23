import java.util.Scanner;

public class _19Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();

        //121
        //12321
        boolean flag=true;
        String s=Integer.toString(num);
        for(int i=0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                flag=false;
                break;
            } 
        }
        if(flag){
            System.out.println("Number is Palindrom");
        }
        else{
            System.out.println("Number is Not a Palindrom");
        }
    }
}
