import java.util.Scanner;

public class BOJ_9020 {
	public static boolean isPrime(int k) {
		for (int i = 2; i < k; i++) {
			if (k % i == 0) {
				return false;
			} else {
				continue;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] nArr = new int[t];
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			nArr[i] = n;
		}
		for (int i = 0; i < t; i++) {
			int n = nArr[i];
			int divN = n / 2;
			int k = n - divN;
			while (true) {
				k = n - divN;
				if (isPrime(k) && isPrime(divN)) {
					break;
				} else {
					divN--;
				}
			}
			System.out.println(divN + " " + k);
		}
	}

}
