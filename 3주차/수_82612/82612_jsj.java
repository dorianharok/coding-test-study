import java.util.stream.IntStream;

public class 부족한_금액_계산하기 {
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;

		print(price, money, count);
	}

	private static void print(int price, int money, int count) {
		long solution = solution(price, money, count);
		System.out.println("solution = " + solution);
	}

	public static long solution(int price, int money, int count) {
		long sum = IntStream.range(1, count + 1)
			.mapToLong(i -> price * i)
			.sum();

		return sum > money ? sum - money : 0;
	}
}
