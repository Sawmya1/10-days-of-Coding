package codeforce;
import java.math.*;
import java.util.*;

public class Prision_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while(t-->0)
     {
    	 int n = sc.nextInt();
    	 int m = sc.nextInt();
    	 int r = sc.nextInt();
    	 int c = sc.nextInt();
    	 System.out.println(Math.max(n-r,r-1)+Math.max(m-c,c-1));
     }
	}

}
