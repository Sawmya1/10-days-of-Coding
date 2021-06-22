package codeforce;
import java.util.*;
public class Four_segments {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	   while(t-->0)
	   {
		   int arr[] = new int[4];
		   for(int i=0; i<4; i++)
	    	   arr[i] = sc.nextInt();
		   Arrays.sort(arr);
		   System.out.println(arr[0]*arr[2]);
	   }
	}
}
