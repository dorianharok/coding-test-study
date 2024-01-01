import java.util.Arrays;
import java.util.HashSet;

public class 바탕화면_정리 {
	public static void main(String[] args) {
		String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};

		print(wallpaper);
	}

	private static void print(String[] wallpaper) {
		int[] solution = solution(wallpaper);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	public static int[] solution(String[] wallpaper) {
		String[][] wall = Arrays.stream(wallpaper)
			.map(s -> s.split(""))
			.toArray(String[][]::new);
		HashSet<int[]> set = new HashSet<>();
		for (int i = 0; i < wall.length; i++) {
			for (int j = 0; j < wall[i].length; j++) {
				if (wall[i][j].equals("#")) {
					set.add(new int[] {i, j});
					set.add(new int[] {i + 1, j + 1});
				}
			}
		}

		int minX = Integer.MAX_VALUE;
		int minY = Integer.MAX_VALUE;
		int maxX = Integer.MIN_VALUE;
		int maxY = Integer.MIN_VALUE;
		for (int[] num : set) {
			minX = Math.min(num[0], minX);
			minY = Math.min(num[1], minY);
			maxX = Math.max(num[0], maxX);
			maxY = Math.max(num[1], maxY);
		}

		return new int[] {minX, minY, maxX, maxY};
	}
}
