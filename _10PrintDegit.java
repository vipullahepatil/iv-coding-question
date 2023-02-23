import java.util.Scanner;

public class _10PrintDegit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        PrintInOrder(num);
        PrintInRevOrder(num);  
    }
    public static void PrintInRevOrder(int num){
        String s=Integer.toString(num);
        char []arr=s.toCharArray();
       for(int i=arr.length-1;i>=0;i--){
        System.out.println(arr[i]);
       }
    }
    public static void PrintInOrder(int num){
        String s=Integer.toString(num);
        char []arr=s.toCharArray();
        for (char c : arr) {
            System.out.println(c);
        }
    }
    public static void RevNum(int num){
        int rem=0;
        while(num!=0){
            rem=num%10;
            System.out.println(rem);
            num=num/10;
        }
    }
}