import java.util.Scanner;

public class BOJ_4948 {

	public static void main(String[] args) {
		final int MAX = 1000000;
		boolean[] isPrime = new boolean[MAX + 1];
		isPrime[0] = true;
		isPrime[1] = true;
		for (int i = 2; i <= (int) Math.sqrt(MAX); i++) {
			for (int j = 2; i * j < MAX + 1; j++) {
				isPrime[i * j] = true;
			}
		}
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int count = 0;
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			for (int i = n + 1; i <= 2 * n; i++) {
				if(!isPrime[i]) {
					count++;
				}
			}
			System.out.println(count);
			count = 0;
		}

	}
}
