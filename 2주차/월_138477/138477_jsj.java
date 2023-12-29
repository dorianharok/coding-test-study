import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 명예의_전당_1 {
	public static void main(String[] args) {
		int k = 3;
		int[] score = {10, 100, 20, 150, 1, 100, 200};

		print(k, score);
	}

	private static void print(int k, int[] score) {
		int[] solution = solution(k, score);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	public static int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		int[] temp = new int[score.length];
		for(int i = 0; i<score.length; i++) {
			temp[i] = score[i];
			List<Integer> arr = Arrays.stream(temp)
				.boxed()
				.sorted(Collections.reverseOrder())
				.toList();
			if(i < k-1){
				answer[i] = arr.get(i);
			}else {
				answer[i] = arr.get(k-1);
			}
		}
		return answer;
	}
}
