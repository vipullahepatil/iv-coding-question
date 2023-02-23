import java.util.Scanner;

public class _18LcmPrimeFactor {
    public static void main(String args[])
	{
		System.out.print("Enter Two No:");
		Scanner sc =new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int [] arr=new int[10];
		int [] brr=new int[10];
		//int arr[]={0,0,0,0,0,0,0,0,0,0};
		//int brr[]={0,0,0,0,0,0,0,0,0,0};
		int i=2,sum=0,lcm=1;
		while(a != 1)
		{
			if(a%i==0)
			{
				arr[i]++;
				a=a/i;
				i=2;
			}
			else
				i++;
		}
		while(b != 1)
		{
			if(b%i==0)
			{
				brr[i]++;
				b=b/i;
				i=2;
			}
			else
				i++;
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]<brr[i])
			{
				if(brr[i]==0)
					continue;
				sum=(int) Math.pow(i,brr[i]);
				lcm=lcm*sum;
			}
			else
			{
				if(arr[i]==0)
						continue;
				sum=(int) Math.pow(i,arr[i]);
				lcm=lcm*sum;
			}
		}
		System.out.println("Lcm="+lcm);
		
	}
}
