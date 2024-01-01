public class 크기가_작은_부분문자열 {
	public static void main(String[] args) {
		String t = "3141592";
		String p = "3141592";

		print(t, p);
	}

	private static void print(String t, String p) {
		int solution = solution(t, p);
		System.out.println("solution = " + solution);
	}

	public static int solution(String t, String p) {
		int answer = 0;
		for (int i = 0; i <= t.length() - p.length(); i++) {
			if(Long.parseLong(t.substring(i, p.length()+i)) <= Long.parseLong(p)) answer ++;
		}

		return answer;
	}
}
