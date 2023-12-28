public class 콜라_문제 {
	public static void main(String[] args) {
		int a = 3;
		int b = 1;
		int n = 20;

		print(a, b, n);
	}

	private static void print(int a, int b, int n) {
		int solution = solution(a, b, n);
		System.out.println("solution = " + solution);
	}

	public static int solution(int a, int b, int n) {
		int answer = 0;
		while (a <= n) {
			int num = n / a;
			int bottle = num * b;
			answer += bottle;
			n = n - num * a + bottle;
		}
		return answer;
	}

}
