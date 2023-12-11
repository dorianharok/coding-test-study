public class 핸드폰_번호_가리기 {
	public static void main(String[] args) {
		String phone_number = "01033334444";

		print(phone_number);
	}

	private static void print(String phone_number) {
		String answer = solution(phone_number);
		System.out.println("answer = " + answer);
	}

	public static String solution(String phone_number) {
		String answer = "*";
		return answer.repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4);
	}
}
