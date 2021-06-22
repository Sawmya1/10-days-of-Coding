package codeforce;
import java.util.*;
public class Last_min_enhancements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n;
		while(t!=0) {
			n=sc.nextInt();
			Set<Integer> s=new TreeSet<>();
			for(int i=0;i<n;i++) {
				int a=sc.nextInt();
				if(s.contains(a))
					s.add(a+1);
				else
					s.add(a);
			}
			System.out.println(s.size());
			t--;
		}

	}
}
