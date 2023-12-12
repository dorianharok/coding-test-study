public class 시저_암호 {
	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;

		print(s, n);
	}

	private static void print(String s, int n) {
		String solution = solution(s, n);
		System.out.println("solution = " + solution);
	}

	public static String solution(String s, int n) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (Character.isAlphabetic(chars[i])) {
				int shift = Character.isUpperCase(chars[i]) ? 65 : 97;
				chars[i] = (char)((chars[i] + n - shift) % 26 + shift);
			}
		}
		return String.copyValueOf(chars);
	}
}
