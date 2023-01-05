import java.util.Scanner;
import java.util.Stack;

public class BOJ_10773 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		Scanner sc = new Scanner(System.in);
		int K = 0;
		int num;
		int sum = 0;
		K = sc.nextInt();
		for (int i = 0; i < K; i++) {
			num = sc.nextInt();
			if (num == 0) {
				stack.pop();
			} else {
				stack.push(num);
			}
		}
		while (!stack.empty()) {
			sum += stack.pop();
		}
		System.out.println(sum);

	}

}
