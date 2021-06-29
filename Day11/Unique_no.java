package codeforce;
import java.util.*;
public class Unique_no {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int t = sc.nextInt();
	  while(t-->0)
	  {
		  int n = sc.nextInt();
		  String ans ="";
		  for(int i=9; i>=1; i--)
		  {
			  if(n>=i)
			  {
				  ans += i;
				  n -= i;
			  }
		  }
		  if(n==0)
		   System.out.println(ans);
		  else
			 System.out.println(-1);
	  }
	}
}
