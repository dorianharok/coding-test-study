import java.util.Arrays;

public class 소수_찾기 {
	public static void main(String[] args) {
		int n = 10;

		int solution = solution(n);
		System.out.println("solution = " + solution);
	}

	public static int solution(int n) {
		int[] numbers = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			numbers[i] = i;
		}
		for (int i = 2; i <= n; i++) {
			if(numbers[i]==0) continue;
			for (int j = 2*i; j <= n; j+=i) {
				numbers[j] = 0;
			}
		}
		return (int)Arrays.stream(numbers).filter(i->i>0).count();
	}
}
