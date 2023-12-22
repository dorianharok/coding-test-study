public class 최대공약수와_최소공배수 {
	public static void main(String[] args) {
		int n = 3;
		int m = 12;

		print(n, m);
	}

	private static void print(int n, int m) {
		int[] solution = solution(n, m);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	public static int[] solution(int n, int m) {
		int a = n;
		int b = m;
		int tmp;
		while(b!=0){
			tmp=a%b;
			a=b;
			b=tmp;
		}
		return new int[]{a,n*m/a};
	}
}
