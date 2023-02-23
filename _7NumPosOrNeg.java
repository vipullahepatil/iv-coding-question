import java.util.Scanner;

class _7NumPosOrNeg{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Negetive number");
        }
        else{
            System.out.println("Positive Number");
        }
    }
}