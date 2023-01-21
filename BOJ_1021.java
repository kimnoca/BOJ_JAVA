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
		for (int i = 1; i <= n; i++) { // �ʱ� �� �ʱ�ȭ
			deque.add(i);
		}
		String num = br.readLine();
		int result = 0;
		for (int i = 0; i < m; i++) {
			int key = Integer.parseInt(num.split(" ")[i]);
			if (deque.indexOf(key) <= deque.size() / 2) { // key�� �������� �տ��� ������ ���
				while (key != deque.getFirst()) {
					deque.addLast(deque.removeFirst());
					result++;
				}
			} else {
				while (key != deque.getFirst()) { // key�� �������� �ڿ��� ������ ���
					deque.addFirst(deque.removeLast());
					result++;
				}
			}
			deque.removeFirst();
		}
		System.out.println(result);

	}

}
