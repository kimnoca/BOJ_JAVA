import java.util.Scanner;

public class BOJ_1343 {
	public static void main(String[] args) {
		String input = "";
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		String tmp = "";
		tmp = input.replaceAll("XXXX", "AAAA");
		tmp = tmp.replaceAll("XX", "BB");
		if (tmp.contains("X")) {
			System.out.println("-1");
		} else {
			System.out.println(tmp);
		}
	}
}
