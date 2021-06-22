package codeforce;
import java.util.*;
public class MoveTurn {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(n%2 != 0)
      {
    	  System.out.println(4*n);
      }
      else
      {
         System.out.println(2*n);
      }
	}

}
