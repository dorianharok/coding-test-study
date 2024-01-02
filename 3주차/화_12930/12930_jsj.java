public class 이상한_문자_만들기 {
	public static void main(String[] args) {
		String s = "try hello world";

		print(s);
	}

	private static void print(String s) {
		String solution = solution(s);
		System.out.println("solution = " + solution);
	}

	public static String solution(String s) {
		StringBuilder answer = new StringBuilder();
		String[] str = s.split("");
		int cnt = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(" ")) {
				cnt = 0;
			} else if (cnt % 2 == 0) {
				str[i] = str[i].toUpperCase();
				cnt++;
			}else {
				str[i] = str[i].toLowerCase();
				cnt++;
			}
			answer.append(str[i]);
		}
		return answer.toString();
	}
}
