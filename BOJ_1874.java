import java.util.*;

public class BOJ_1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int k = 0;
		stack.push(1);
		sb.append("+\n");
		int index = 2;
		for (int i = 0; i < n; i++) {

			if (stack.empty()) {
				stack.push(index);
				index++;
				sb.append("+\n");
			}

			k = sc.nextInt();

			if (stack.peek() < k) {
				for (int w = index; w <= k; w++) {
					stack.push(w);
					index++;
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else if (stack.peek() > k) {
				while (k != stack.peek()) {
					stack.pop();
					sb.append("-\n");
					if (stack.size() == 0) {
						break;
					}
				}
				if (!stack.empty()) {
					stack.pop();
					sb.append("-\n");
				} else {
					continue;
				}
			} else if (stack.peek() == k) {
				stack.pop();
				sb.append("-\n");
			}

		}
		// NO �Ǻ�
		String result = sb.toString();
		int check = 0;
		for (int i = 0; i < result.length(); i++) {
			if (result.charAt(i) == '-') {
				check++;
			}
		}
		if (check == n) {
			System.out.println(result);
		} else {
			System.out.println("NO");
		}

	}

}
