import java.util.ArrayList;

public class 기사단원의_무기 {
	public static void main(String[] args) {
		int number = 10;
		int limit = 3;
		int power = 2;

		print(number, limit, power);
	}

	private static void print(int number, int limit, int power) {
		int solution = solution(number, limit, power);
		System.out.println("solution = " + solution);
	}

	public static int solution(int number, int limit, int power) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 1; i <= number; i++) {
			int num = 0;
			for (int j = 1; j <= number; j++) {
				if (i % j == 0) num++;
			}
			if (num > limit) {
				num = power;
			}
			arr.add(num);
		}
		return arr.stream().mapToInt(Integer::intValue).sum();
	}
}
