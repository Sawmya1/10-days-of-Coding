package codeforce;
import java.util.Scanner;

public class InterestingFunction_F_1538 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
        	int l= sc.nextInt();
        	int r = sc.nextInt();
        	int s =0;
        	while(r!=0)
        	{
        		s+=r-l;
        		r/=10;
        		l/=10;
        	}
        	System.out.println(s);
        }
	}
}