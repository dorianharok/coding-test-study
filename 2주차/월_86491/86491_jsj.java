public class 최소직사각형 {
	public static void main(String[] args) {
		int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};

		print(sizes);
	}

	private static void print(int[][] sizes) {
		int solution = solution(sizes);
		System.out.println("solution = " + solution);
	}

	public static int solution(int[][] sizes) {
		for (int i = 0; i < sizes.length; i++) {
			int temp = 0;
			if (sizes[i][0] > sizes[i][1]) {
			}else{
				temp = sizes[i][0];
				sizes[i][0]=sizes[i][1];
				sizes[i][1]=temp;
			}
		}
		int x = sizes[0][0];
		int y = sizes[0][1];
		for (int i = 0; i < sizes.length; i++) {
			if(x>sizes[i][0]){
			}else{
				x=sizes[i][0];
			}
		}
		for (int i = 0; i < sizes.length; i++) {
			if(y>sizes[i][1]){
			}else{
				y=sizes[i][1];
			}
		}
		return x*y;
	}
}
