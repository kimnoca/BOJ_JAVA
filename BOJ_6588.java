import java.util.Scanner;

public class BOJ_6588 {

	public static void main(String[] args) {
		boolean[] isPrime = new boolean[1000001]; //테스트 케이스는 1000000까지의 정수이기 때문에 
		isPrime[0] = true; 
		isPrime[1] = true;
		for (int i = 2; i <= (int) Math.sqrt(1000000); i++) { 
			for (int j = 2; i * j < 1000001; j++) {
				isPrime[i * j] = true; 
			}
		}
		Scanner sc = new Scanner(System.in);
		int n = 1;
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int startNum = 2;
			while (true) {
				int k = n - startNum;
				while (true) {
					k = n - startNum;
					if (!isPrime[k] && !isPrime[startNum]) {
						break;
					} else {
						startNum++;
					}
				}
				if (k != 0) {
					System.out.println(n + " = " + startNum + " + " + k);
					break;
				} else {
					System.out.println("Goldbach's conjecture is wrong.");
				}
			}
		}
	}
}
