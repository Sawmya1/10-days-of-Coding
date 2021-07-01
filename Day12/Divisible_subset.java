package codeforce;
import java.util.Scanner;
public class Divisible_subset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int arr[] = new int [(n+1)];
			int mod[] = new int [(n+1)];
			int vis[] = new int [(n+1)];
			boolean check = false;
			for(int i = 1;i<=n;i++) {
				arr[i] = sc.nextInt();
				if(arr[i]%n == 0 && !check) {
					System.out.println(1);
					System.out.println(i);
					check = true;
				}
			}
			if(!check) {
				vis[0] = 1;
				int i,j;
				for(i = 1;i<=n;i++) {
					mod[i] = (mod[i-1]+arr[i])%n;
					mod[i] = (mod[i]+n)%n;
					if(vis[mod[i]] == 1)break;
					vis[mod[i]] = 1;
				}
				for(j = 0;j<=i;j++) {
					if(mod[j] == mod[i])break;
				}
				System.out.println(i - j);
				for(++j;j<=i;j++) {
					System.out.print(j + " ");
				}
				System.out.println();				
			}
		}	
	}
}