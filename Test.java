// BOJ Week1 - 11653 소인수분해 
// N을 입력받아 N의 모든 소인수분해 과정 출력

import java.util.Scanner;

public class BOJ_11653 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int startNum = 2;
		while (N != 1) {
			if (N % startNum == 0) {
				System.out.println(startNum);
				N /= startNum;
			} else {
				startNum++;
			}
		}
	}
}
