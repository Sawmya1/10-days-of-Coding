package codeforce;
import java.util.Scanner;
import java.math.BigInteger;
public class BigIntegerDemo {
	static BigInteger factorial(int N)
    {
        // Initialize result
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
  
        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));
  
        return f;
    }
  

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        System.out.println(factorial(N));


	}

}
