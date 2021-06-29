package codeforce;
import java.util.*;
public class Sumof2050_1517_A {

	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();
          while(t-->0)
          {
        	  long n=sc.nextLong();
  			if(n%2050==0)
  			{
  				int sum=0;
  				long j=n/2050;
  				for( ;j>0;j/=10)
  				{
  					sum+=j%10;
  				}
  				System.out.println(sum);
  			}
  			else
  				System.out.println("-1");
  		}
	}

}
