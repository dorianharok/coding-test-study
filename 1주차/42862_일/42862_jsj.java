import java.util.Arrays;

public class 체육복 {
	public static void main(String[] args) {
		int n = 4;
		int[] lost = {1, 3};
		int[] reverse = {2, 4};

		print(n, lost, reverse);
	}

	private static void print(int n, int[] lost, int[] reserve) {
		int solution = solution(n, lost, reserve);
		System.out.println("solution = " + solution);
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int[] arr = new int[n + 1];

		Arrays.fill(arr, 1);

		for (int i : lost) {
			arr[i]--;
		}
		for (int i : reserve) {
			arr[i]++;
		}

		for (int i = 1; i <= n; i++) {
			if (arr[i] == 0) {
				if (i > 1 && arr[i - 1] == 2) {
					arr[i]++;
					arr[i - 1]--;
				} else if (i < n && arr[i + 1] == 2) {
					arr[i]++;
					arr[i + 1]--;
				}
			}
		}

		return (int)Arrays.stream(arr).filter(i -> i > 0).count() - 1;
	}
}
