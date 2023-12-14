public class 문자열_나누기 {
	public static void main(String[] args) {
		String s = "abracadabra";

		print(s);
	}

	private static void print(String s) {
		int solution = solution(s);
		System.out.println("solution = " + solution);
	}

	public static int solution(String s) {
		int answer = 0;
		char x = s.charAt(0);
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (cnt == 0) {
				answer++;
				x = s.charAt(i);
			}
			cnt = s.charAt(i) == x ? cnt+1 : cnt-1;
		}
		return answer;
	}
}
