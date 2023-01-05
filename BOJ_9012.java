import java.util.Scanner;

public class BOJ_9012 {
	public static void main(String[] args) {
		int K;
		int[] num;
		char c = ' ';
		String[] answer;
		Scanner sc = new Scanner(System.in);
		K = sc.nextInt();
		num = new int[K];
		answer = new String[K];
		for (int i = 0; i < K; i++) {
			answer[i] = sc.next();
		}
		for (int i = 0; i < K; i++) {
			num[i] = 0;
			for (int j = 0; j < answer[i].length(); j++) {
				if (answer[i].charAt(j) == '(') {
					num[i] += 1;
				} else if (answer[i].charAt(j) == ')') {
					num[i] -= 1;
				}
				if (num[i] < 0) { // ó���� �� ���ǹ��� �ɾ����� �ʾƼ� ���� �Է� 2���� �ɸ� num[i]�� ������ �Ǵ¼��� �������� ��ȣ�� �ƴϰԵ�
					answer[i] = "NO";
					// continue;
				}
			}
			if (num[i] == 0) {
				answer[i] = "YES";
			} else {
				answer[i] = "NO";
			}
		}

		for (int i = 0; i < K; i++) {
			System.out.println(answer[i]);
		}

	}
}
