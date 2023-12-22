public class 2016년 {
	public static void main(String[] args) {
		int a = 5;
		int b = 24;

		print(a, b);
	}

	private static void print(int a, int b) {
		String answer = solution(a, b);
		System.out.println("answer = " + answer);
	}

	public static String solution(int a, int b) {
		int[] days = {-1, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] answer = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int num = 5;
		for (int i = 1; i <= a; i++) {
			if (i == a) {
				num += b % 7;
			} else {
				num += days[i] % 7;
			}
		}
		return answer[(num - 1) % 7];
	}
}
