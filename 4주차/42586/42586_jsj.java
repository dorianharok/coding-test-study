import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};

		print(progresses, speeds);
	}

	private static void print(int[] progresses, int[] speeds) {
		int[] solution = solution(progresses, speeds);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < progresses.length; i++) {
			if ((100 - progresses[i]) % speeds[i] == 0) {
				q.add((100 - progresses[i]) / speeds[i]);
			} else {
				q.add((100 - progresses[i]) / speeds[i] + 1);
			}
		}

		ArrayList<Integer> arr = new ArrayList<>();
		int prevDeploy = 0;
		while (!q.isEmpty()) {
			int deploy = q.poll();
			if (arr.isEmpty() || prevDeploy < deploy) {
				arr.add(1);
				prevDeploy = deploy;
			} else {
				int idx = arr.size() - 1;
				int count = arr.get(idx) + 1;
				arr.set(idx, count);
			}
		}

		return arr.stream().mapToInt(Integer::intValue).toArray();
	}
}
