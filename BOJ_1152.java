
import java.util.Scanner;

public class BOJ_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String answer[] = text.split(" ");
		if (answer.length <= 0)
			System.out.println("0");
		else {
			if ("".equals(answer[0])) {
				System.out.println(answer.length - 1);
			} else {
				System.out.println(answer.length);
			}
		}
	}
}
