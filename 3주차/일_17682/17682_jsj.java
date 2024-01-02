public class 다트_게임 {
	public static void main(String[] args) {
		String dartResult = "1D2S#10S";

		print(dartResult);
	}

	private static void print(String dartResult) {
		int solution = solution(dartResult);
		System.out.println("solution = " + solution);
	}

	public static int solution(String dartResult) {
		int answer = 0;
		int[] scores = new int[3];

		char[] chars = dartResult.toCharArray();
		int idx = -1;
		String numstr = "";
		for (int i = 0; i < chars.length; i++) {
			char ch = dartResult.charAt(i);

			if (Character.isDigit(ch)) {
				numstr += ch;
			} else if (Character.isAlphabetic(ch)) {
				idx++;
				int num = Integer.parseInt(numstr);
				if (ch == 'S') {
					scores[idx] = (int) Math.pow(num, 1);
				} else if (ch == 'D') {
					scores[idx] = (int) Math.pow(num, 2);
				} else if (ch == 'T') {
					scores[idx] = (int) Math.pow(num, 3);
				}
				numstr = "";
			} else {
				if (ch == '*') {
					scores[idx] *= 2;
					if (idx > 0) scores[idx - 1] *= 2;
				} else if (ch == '#') {
					scores[idx] *= -1;
				}
			}
		}
		for (int score : scores) {
			answer += score;
		}
		return answer;
	}
}
