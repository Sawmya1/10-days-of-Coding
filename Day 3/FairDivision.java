package codeforce;
import java.util.*;
public class FairDivision {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			int one = 0, two = 0;
			for(int i=0; i<n; i++)
			{
				arr[i] = sc.nextInt();
				if(arr[i] == 1)
					one++;
				else
					two++;
			}
			if((one!=0 && one%2==0) || (one==0 && two%2==0))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
