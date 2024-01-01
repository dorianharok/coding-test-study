import java.util.Arrays;

public class 공원_산책 {
	public static void main(String[] args) {
		String[] park = {"SOO", "OXX", "OOO"};
		String[] routes = {"E 2", "S 2", "W 1"};

		print(park, routes);
	}

	private static void print(String[] park, String[] routes) {
		int[] solution = solution(park, routes);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	public static int[] solution(String[] park, String[] routes) {
		int x = 0;
		int y = 0;
		int h = park.length;
		int w = park[0].length();
		for (int i = 0; i < park.length; i++) {
			int idx = park[i].indexOf("S");
			if (idx != -1) {
				x = idx;
				y = i;
				break;
			}
		}

		for (String route : routes) {
			String[] str = route.split(" ");
			String dir = str[0];
			int move = Integer.parseInt(str[1]);
			int nextX = x;
			int nextY = y;

			for (int j = 0; j < move; j++) {
				switch (dir) {
					case "E" -> nextX++;
					case "W" -> nextX--;
					case "S" -> nextY++;
					case "N" -> nextY--;
				}

				if (nextX >= 0 && nextX < w && nextY >= 0 && nextY < h) {
					if (park[nextY].charAt(nextX) == 'X')
						break;
					if (j == move - 1) {
						x = nextX;
						y = nextY;
					}
				}
			}
		}

		return new int[] {y, x};
	}
}
