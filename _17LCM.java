import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _17LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1");
        int a=sc.nextInt();
        System.out.println("Enter Number2");
        int b=sc.nextInt();

        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        /*
            
        */
        int [] arr=new int[b];  // arr=int[9]
		for(int i=0;i<b;i++)//i<8 
			arr[i]=a*(i+1);      //arr[0]=6*1=6,arr[1]=6*2=12,arr[2]=6*3=18....
		
		int [] brr=new int[a];    //brr=int[6]
		for(int i=0;i<a;i++) //i<=5
			brr[i]=b*(i+1);       //brr[0]=9*1=9,brr[1]=9*2=18,
		int i=0,j=0;          //arr=6,12,18,....  brr=9,18,....
		
		while(arr[i]!=brr[j]) //  6!=9|12!=9  |12!=18  |  18==18
		{
			if(arr[i]<brr[j])//  6<9  |  12<9 |12<18   |
				i++;         // arr 12|       |arr 18
			else
				j++;         //       |brr 18
		}
		System.out.println("Lcm="+arr[i]); //print 18   
    }
}
