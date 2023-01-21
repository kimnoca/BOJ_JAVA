import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BOJ_1021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> deque = new LinkedList<>();
		String input = br.readLine();
		int n = Integer.parseInt(input.split(" ")[0]);
		int m = Integer.parseInt(input.split(" ")[1]);
		for (int i = 1; i <= n; i++) { // 초기 덱 초기화
			deque.add(i);
		}
		String num = br.readLine();
		int result = 0;
		for (int i = 0; i < m; i++) {
			int key = Integer.parseInt(num.split(" ")[i]);
			if (deque.indexOf(key) <= deque.size() / 2) { // key값 기준으로 앞에가 더많은 경우
				while (key != deque.getFirst()) {
					deque.addLast(deque.removeFirst());
					result++;
				}
			} else {
				while (key != deque.getFirst()) { // key값 기준으로 뒤에가 더많은 경우
					deque.addFirst(deque.removeLast());
					result++;
				}
			}
			deque.removeFirst();
		}
		System.out.println(result);

	}

}
