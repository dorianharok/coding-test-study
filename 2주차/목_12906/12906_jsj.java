import java.util.Arrays;
import java.util.Stack;

public class 같은_숫자는_싫어 {
	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};

		print(arr);
	}

	private static void print(int[] arr) {
		int[] solution = solution(arr);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	public static int[] solution(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		Arrays.stream(arr).forEach(stack::push);

		Stack<Integer> s = new Stack<>();
		for (Integer num : stack) {
			if (!s.isEmpty()) {
				if (s.peek().equals(num)) {
					s.pop();
				}
			}
			s.push(num);
		}
		return s.stream().mapToInt(Integer::intValue).toArray();
	}
}
