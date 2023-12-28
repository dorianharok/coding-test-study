public class 푸드_파이트_대회 {
	public static void main(String[] args) {
		int[] food = {1, 3, 4, 6};

		print(food);
	}

	private static void print(int[] food) {
		String solution = solution(food);
		System.out.println("solution = " + solution);
	}

	public static String solution(int[] food) {
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < food.length; i++) {
			String str = i+"";
			str = str.repeat(food[i] / 2);
			answer.append(str);
		}
		String origin = answer.toString();
		return origin+"0"+answer.reverse();

	}
}
