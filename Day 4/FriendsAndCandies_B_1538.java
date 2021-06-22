package codeforce;
import java.util.*;
public class FriendsAndCandies_B_1538 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
			int t=sc.nextInt();
			while(t-->0)
			{
				int n=sc.nextInt();
				int a[]=new int[n];
				int sum=0;
				int ans=0;
				for(int i=0;i<n;i++)
				{
					a[i]=sc.nextInt();
					sum+=a[i];
				}
				int avg=sum/n;
				for(int i=0;i<n;i++)
				{
					if(a[i]>avg)ans++;
				}
				System.out.println(sum%n==0?ans:-1);
			}
     }

}
