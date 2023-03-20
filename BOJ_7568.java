import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Body {
	int x;
	int y;
	int rank;

	Body(int x, int y, int n) {
		this.x = x;
		this.y = y;
		this.rank = n;
	}
}

public class BOJ_7568 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Body[] bodys = new Body[n];
		for (int i = 0; i < n; i++) {
			String x = br.readLine();
			String[] tmp = x.split(" ");
			bodys[i] = new Body(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), n);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == j) continue;
				if(bodys[i].x > bodys[j].x && bodys[i].y > bodys[j].y) {
					bodys[i].rank--;
				}
				else if(bodys[i].x < bodys[j].x && bodys[i].y < bodys[j].y) {
					continue;
				}
				else {
					bodys[i].rank--;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(bodys[i].rank);
		}

	}
}
