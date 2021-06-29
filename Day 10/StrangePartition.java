package codeforce;
import java.util.Scanner;
public class StrangePartition {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int t = sc.nextInt();
	  while(t-->0)
	  {
		  int n = sc.nextInt();
		  double x = sc.nextDouble();
		  long min=0;
		  long max=0;
		  long[] arr = new long[n];
		  for(int i=0;i<n;i++)
		  {	  
			  arr[i] = sc.nextLong();
			  min += arr[i];
			  max += Math.ceil(arr[i]/x);
		  }	 
		  System.out.println((long)Math.ceil(min/x)+" "+max);
	  }	  
	}
}
