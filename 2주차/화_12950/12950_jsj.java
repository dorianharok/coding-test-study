public class 행렬의_덧셈 {
	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3, 4}, {5, 6}};

		print(arr1, arr2);
	}

	private static void print(int[][] arr1, int[][] arr2) {
		int[][] solution = solution(arr1, arr2);
		System.out.println("solution = " + Arrays.deepToString(solution));
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = arr1;
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr1[0].length; j++){
				answer[i][j] += arr2[i][j];
			}
		}
		return answer;
	}
}
