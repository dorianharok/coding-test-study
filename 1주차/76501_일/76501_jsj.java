public class 음약_더하기 {
	public static void main(String[] args) {
		int[] absolutes = {4,7,12};
		boolean[] signs = {true, false, true};

		print(absolutes, signs);
	}

	private static void print(int[] absolutes, boolean[] signs) {
		int solution = solution(absolutes, signs);
		System.out.println("solution = " + solution);
	}

	public static int solution(int[] absolutes, boolean[] signs) {
		int num=0;
		for (int i = 0; i < signs.length; i++) {
			num = signs[i] ? num+absolutes[i] : num-absolutes[i];
		}
		return num;
	}
}
