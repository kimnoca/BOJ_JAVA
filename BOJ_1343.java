import java.util.Scanner;

public class BOJ_1343 {
	public static void main(String[] args) {
		String input = "";
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		String ans = "";
		ans = input.replaceAll("XXXX", "AAAA");
		ans = ans.replaceAll("XX", "BB");
		if (ans.contains("X")) {
			System.out.println("-1");
		} else {
			System.out.println(ans);
		}
	}
}
