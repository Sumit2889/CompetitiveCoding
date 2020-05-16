//The task is to find the maximum number of bishops that can be placed on a chessboard in such a way that no two bishops threaten each other.

import java.util.Scanner;
import java.math.BigInteger;

class MAIN{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			BigInteger num = new BigInteger(sc.next());
			if(num.equals(BigInteger.ONE))
				System.out.println(1);
			else
				System.out.println((num.multiply(BigInteger.valueOf(2))).subtract(BigInteger.valueOf(2)));
			
		}
		sc.close();
	}
}
