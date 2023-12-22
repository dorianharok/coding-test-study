public class 콜라츠_추측 {
	public static void main(String[] args) {
		int n = 626331;

		print(n);
	}

	private static void print(int n) {
		int solution = solution(n);
		System.out.println("solution = " + solution);
	}

	public static int solution(int n) {
		int answer = 0;
		long num = n;
		while (num != 1) {
			answer++;
			if (answer > 500) {
				answer = -1;
				break;
			}
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num = num * 3 + 1;
			}

		}
		return answer;
	}
}
