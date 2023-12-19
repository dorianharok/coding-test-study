public class 문자열_다루기_기본 {
	public static void main(String[] args) {
		String s = "+123";

		print(s);
	}

	private static void print(String s) {
		boolean solution = solution(s);
		System.out.println("solution = " + solution);
	}

	public static boolean solution(String s) {
		if (s.length() == 4 || s.length() == 6) {
			try {
				Integer.parseInt(s);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		}
		return false;
	}
}
