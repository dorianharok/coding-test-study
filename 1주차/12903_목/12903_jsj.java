public class 가운데_글자_가져오기 {
	public static void main(String[] args) {
		String s = "we";
		print(s);
	}

	private static void print(String s) {
		String answer = solution(s);
		System.out.println("answer = " + answer);
	}

	public static String solution(String s) {
		String answer = "";
		if (s.length() % 2 != 0) {
			answer = s.substring(s.length() / 2, s.length() / 2 + 1);
		} else {
			answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
		}
		return answer;
	}
}
