public class 둘만의_암호 {
	public static void main(String[] args) {
		String s = "wxyz";
		String skip = "abcdefghij";
		int index = 20;

		print(s, skip, index);
	}

	private static void print(String s, String skip, int index) {
		String solution = solution(s, skip, index);
		System.out.println("solution = " + solution);
	}

	public static String solution(String s, String skip, int index) {
		char[] chars = s.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char currentChar = chars[i];
			for (int j = 0; j < index; j++) {
				char nextChar = (char) ((currentChar + 1 - 'a') % 26 + 'a');
				while (skip.contains(String.valueOf(nextChar))) {
					currentChar = nextChar;
					nextChar = (char) ((currentChar + 1 - 'a') % 26 + 'a');
				}
				currentChar = nextChar;
			}

			sb.append(currentChar);
		}

		return sb.toString();
	}
}
