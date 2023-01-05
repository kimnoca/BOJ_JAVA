
import java.util.Scanner;

public class BOJ_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String ans[] = text.split(" ");
		if (ans.length <= 0)
			System.out.println("0");
		else {
			if ("".equals(ans[0])) {
				System.out.println(ans.length - 1);
			} else {
				System.out.println(ans.length);
			}
		}
	}
}
