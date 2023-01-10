import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2750 {

	public static void main(String[] args) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			int k  = sc.nextInt();
			res.add(k);
		}
		Collections.sort(res);
		for(int i = 0 ; i < n ; i++) {
			System.out.println(res.get(i));
		}
	}

}
