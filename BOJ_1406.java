import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1406 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> leftStack = new Stack<>(); // 커서기준 왼쪽 stack
		Stack<Character> rightStack = new Stack<>(); // 커서기준 오른쪽 stack
		String input = br.readLine();
		for (int i = 0; i < input.length(); i++) { // 일단 초반 문자열을 커서기준 왼쪽 stack 에 넣어줌
			leftStack.push(input.charAt(i));
		}
		int cmdCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < cmdCount; i++) {
			String cmd = br.readLine();
			switch (cmd.charAt(0)) {
			case 'L':
				if (!leftStack.empty())
					rightStack.push(leftStack.pop());
				break;
			case 'D':
				if (!rightStack.empty())
					leftStack.push(rightStack.pop());
				break;
			case 'B':
				if (!leftStack.empty())
					leftStack.pop();
				break;
			case 'P':
				leftStack.push(cmd.charAt(2));
				break;
			}

		}
		while (!leftStack.empty()) {
			rightStack.push(leftStack.pop());
		}

		StringBuilder sb = new StringBuilder();
		
		while (!rightStack.empty()) {
			sb.append(rightStack.pop());
		}
		System.out.println(sb.toString());

//		while (!rightStack.empty()) {
//			System.out.print(rightStack.pop());
//		}

	}

}
