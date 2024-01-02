public class 정수_제곱근_판별 {
	public static void main(String[] args) {
		int n = 121;

		print(n);
	}

	private static void print(int n) {
		long solution = solution(n);
		System.out.println("solution = " + solution);
	}

	public static long solution(long n) {
		if(Math.sqrt(n)-(int)Math.sqrt(n)>0){
			return -1;
		}else{
			return (long)Math.pow(Math.sqrt(n)+1,2);
		}
	}
}
