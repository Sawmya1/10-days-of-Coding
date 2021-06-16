package codeforce;
import java.util.Scanner;
public class Distracted_A_1520 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	  int t = sc.nextInt();
	  while(t-->0)
	  {   int n = sc.nextInt();
		  String s = sc.next();
		  String[] arrOfStr = s.split("", n);
		  boolean flag=true;
		  for (int i=1;i<n;i++)
		  {
			  if(arrOfStr[i]!=arrOfStr[i-1])
			  {
				  for(int j=i-1;j>=0;j--)
				  {
					  if(arrOfStr[i] == arrOfStr[j])
					  {
						  flag=false;
						  break;
					  }
				  }
			  }

		  }
		  if(flag)
		    System.out.println("YES");
		  else
			 System.out.println("NO");
	  }
	  

}
/*
 * import java.util.*;
 
public class Solution {
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
int n=sc.nextInt();
	String s=sc.next();
	
	
	boolean f=true;
	for(int i=1;i<n;i++) {
		if(s.charAt(i)!=s.charAt(i-1)) {
	for(int j=i-1;j>=0;j--) {			
		if(s.charAt(i)==s.charAt(j)) {
			f=false;
			break;
		}
				}
			}	
	}
	if(f)
		System.out.println("YES");
		else
			System.out.println("NO");		
		}
		
	}			
}
 */
*/