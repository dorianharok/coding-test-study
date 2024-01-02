public class 키패드_누르기 {
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";

		print(numbers, hand);
	}

	private static void print(int[] numbers, String hand) {
		String solution = solution(numbers, hand);
		System.out.println("solution = " + solution);
	}

	public static String solution(int[] numbers, String hand) {
		StringBuilder answer = new StringBuilder();
		int[][] pad = {{3, 1}, {0, 0}, {0, 1}, {0, 2}, {1, 0}, {1, 1}, {1, 2}, {2, 0}, {2, 1}, {2, 2}};

		int[] left = {3, 0};
		int[] right = {3, 2};

		for (int num : numbers) {
			if (num == 1 || num == 4 || num == 7) {
				answer.append("L");
				left = pad[num];
			} else if (num == 3 || num == 6 || num == 9) {
				answer.append("R");
				right = pad[num];
			} else {
				int[] target = pad[num];
				int leftDis = Math.abs(left[0] - target[0]) + Math.abs(left[1] - target[1]);
				int rightDis = Math.abs(right[0] - target[0]) + Math.abs(right[1] - target[1]);

				if (leftDis < rightDis) {
					answer.append("L");
					left = target;
				} else if (leftDis > rightDis) {
					answer.append("R");
					right = target;
				} else {
					if (hand.equals("left")) {
						answer.append("L");
						left = target;
					} else {
						answer.append("R");
						right = target;
					}
				}
			}
		}
		return answer.toString();
	}
}
