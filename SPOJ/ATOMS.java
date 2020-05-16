import java.util.Scanner;
import java.math.BigInteger;

class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test_cases = sc.nextInt();
		while(test_cases-- > 0) {
			BigInteger N = new BigInteger(sc.next());
			BigInteger K = new BigInteger(sc.next());
			BigInteger M = new BigInteger(sc.next());
			
			BigInteger atoms = N.multiply(K);
			int i = 0;
			while(atoms.compareTo(M) <= 0) {
				i++;
				atoms = atoms.multiply(K);
			}
			System.out.println(i);
			
		}
	}
}
