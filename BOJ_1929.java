import java.util.Scanner;

public class BOJ_1929 {
	public static void main(String[] args) {
		final int MAX = 1000000; //n과 m 와 최대크기 
		boolean[] isPrime = new boolean[MAX + 1];
		isPrime[0] = false; 
		isPrime[1] = false;
		for (int i = 2; i <= (int) Math.sqrt(MAX); i++) {
			for (int j = 2; i * j < MAX + 1; j++) {
				isPrime[i * j] = false;
			}
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i = n ; i <= m ; i++) {
			if(isPrime[i]) {
				System.out.println(i);
			}
			else {
				continue;
			}
		}
	}
}
