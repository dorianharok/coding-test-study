public class 하샤드_수 {
	public static void main(String[] args) {
		int x = 10;

		print(x);
	}

	private static void print(int x) {
		boolean solution = solution(x);
		System.out.println("solution = " + solution);
	}

	public static boolean solution(int x) {
		int cnt = 0;
		String[] str = String.valueOf(x).split("");
		for (int i = 0; i < str.length; i++) {
			cnt+=Integer.parseInt(str[i]);
		}
		return x % cnt == 0;
	}
}
