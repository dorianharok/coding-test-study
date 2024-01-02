import java.util.Arrays;

public class 로또의_최고_순위와_최저_순위 {
	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};

		print(lottos, win_nums);
	}

	private static void print(int[] lottos, int[] win_nums) {
		int[] solution = solution(lottos, win_nums);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] rank = {6, 6, 5, 4, 3, 2, 1};
		int highcnt = 0;
		int cnt = 0;
		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < lottos.length; j++) {
				if (lottos[i] == win_nums[j]) {
					cnt++;
				}
			}
		}
		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0) {
				highcnt++;
			}
		}

		return new int[] {rank[cnt + highcnt], rank[cnt]};
	}
}
