import java.util.Arrays;

public class 옹알이_2 {
	public static void main(String[] args) {
		String[] babbling = {"yayae"};

		print(babbling);
	}

	private static void print(String[] babbling) {
		int solution = solution(babbling);
		System.out.println("solution = " + solution);
	}

	public static int solution(String[] babbling) {
		return (int)Arrays.stream(babbling).map(s -> {
				s = s.replaceAll("ayaaya|yeye|woowoo|mama", "!");
				s = s.replaceAll("aya|ye|woo|ma", "");
				return s;
			})
			.filter(s -> s.equals(""))
			.count();
	}
}
