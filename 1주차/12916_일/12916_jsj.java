public class 문자열_내_p와_y의_개수 {
	public static void main(String[] args) {
		String s = "pPoooyY";

		print(s);
	}

	private static void print(String s) {
		boolean solution = solution(s);
		System.out.println("solution = " + solution);
	}

	public static boolean solution(String s) {
		boolean answer = true;
		int p = 0;
		int y = 0;
		char[] chars = s.toLowerCase().toCharArray();
		for (char ch : chars) {
			if (ch == 'p') p++;
			if (ch == 'y') y++;
		}

		return p==y ? answer : false;
	}
}
