public class 타겟_넘버 {
	public static void main(String[] args) {
		int[] numbers = {4, 1, 2, 1};
		int target = 4;

		print(numbers, target);
	}

	private static void print(int[] numbers, int target) {
		int solution = solution(numbers, target);
		System.out.println("solution = " + solution);
	}

	static int count = 0;
	public static int solution(int[] numbers, int target) {
		dfs(numbers, target, 0, 0);
		return count;
	}

	public static void dfs(int[] numbers, int target, int index, int sum) {
		if (index == numbers.length) {
			if (sum == target) {
				count++;
			}
			return;
		}

		dfs(numbers, target, index + 1, sum + numbers[index]);
		dfs(numbers, target, index + 1, sum - numbers[index]);
	}
}
