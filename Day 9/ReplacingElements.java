package codeforce;
import java.util.*;
public class ReplacingElements {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	   while(t-->0)
	   {
		   int n = sc.nextInt();
		   int d = sc.nextInt();
		   int ar[] = new int[n];
		   for(int a=0;a<n;a++)
		     ar[a] = sc.nextInt();
		   Arrays.sort(ar);
		   if(ar[0]+ar[1]<=d || ar[n-1]<=d)
			   System.out.println("YES");
		   else
			   System.out.println("NO");
		  
	   }
	}
}
