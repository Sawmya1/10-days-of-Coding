package codeforce;
import java.util.*;
public class Puzzle_for_the_future_rightans {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 while(t-->0)
		 {
			 int n = input.nextInt();
				String s = input.next();
				int c = (s.charAt(0) - '0') + 1;
				System.out.print("1");
				for(int i = 1;i<n;i++){
					int ch = s.charAt(i)-'0';
					if(ch+1 != c){
						System.out.print("1");
						c = ch+1;
					}
					else{
						System.out.print("0");
						c = ch;
					}
				}
	 
				System.out.println();
		 }
	 }
}
