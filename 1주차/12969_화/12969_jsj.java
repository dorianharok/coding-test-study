import java.util.Scanner;

public class 직사각형_별찍기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		String star = "*";
		for (int i = 0; i < b; i++) {
			sb.append(star.repeat(a) + "\n");
		}
		System.out.println(sb);
	}
}
