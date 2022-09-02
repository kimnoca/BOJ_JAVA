import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//BOJ stack 
public class BOJ_10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //Scanner 
		Stack<Integer> stack = new Stack<>();
		int tlqkf = Integer.parseInt(in.readLine());
		for(int i = 0; i < tlqkf; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			String op = st.nextToken();
			switch (op) {
			case "push":
				int data = Integer.parseInt(st.nextToken());
				stack.push(data);
				break;
			case "pop":
				if (!stack.empty()) {
					System.out.println(stack.pop());
					break;
				} else {
					System.out.println("-1");
					break;
				}
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				if (stack.empty()) {
					System.out.println(1);
					break;
				} else {
					System.out.println(0);
					break;
				}
			case "top":
				if (!stack.empty()) {
					System.out.println(stack.peek());
					break;
				} else {
					System.out.println("-1");
				}
			default:
				break;

			} // switch
		} // while(true)
	}

}
