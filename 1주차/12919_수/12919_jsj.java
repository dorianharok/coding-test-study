public class 서울에서_김서방_찾기 {
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};

		print(seoul);
	}

	private static void print(String[] seoul) {
		String solution = solution(seoul);
		System.out.println("solution = " + solution);
	}

	public static String solution(String[] seoul) {
		int index = IntStream.range(0, seoul.length)
			.filter(i -> seoul[i].equals("Kim"))
			.findFirst()
			.orElse(-1);
		return String.format("김서방은 %s에 있다", index);
	}
}
