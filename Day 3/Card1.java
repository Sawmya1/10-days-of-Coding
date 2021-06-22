package codeforce;
import java.util.*;
public class Card1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long  w, h, n;
			w = sc.nextLong();
			h = sc.nextLong();
			n = sc.nextLong();
			long ans = 1;
			while(w%2==0){
				ans*=2;
				w=w/2;
			}
			while(h%2==0) {
				ans*=2;
				h/=2;
			}
			System.out.println(ans>=n?"YES":"NO");
		}
	}
}
