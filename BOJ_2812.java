import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ_2812 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> res = new PriorityQueue<>(Collections.reverseOrder()); //½ÇÆÐ ~
	//	ArrayList<Integer> res = new ArrayList<Integer>();
		int n = sc.nextInt();
		int k = sc.nextInt();
		String input;
		input = sc.next();
		for (int i = 0; i < n; i++) {
			res.add(Character.getNumericValue(input.charAt(i)));
			;
		}
		for(int i = 0; i < n - k ; i++) {
			System.out.print(res.poll());
		}
	}
}
