public class No_172928 {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();
        String[][] parkMap = new String[h][w];

        Pos pos = null;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                parkMap[i][j] = String.valueOf(park[i].charAt(j));
                if (parkMap[i][j].equals("S")) {
                    pos = new Pos(i, j);
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String[] split = routes[i].split(" ");
            String direction = split[0];
            int distant = Integer.parseInt(split[1]);

            boolean flag;
            switch (direction) {
                case "E":
                    if (pos.y + distant >= w) {
                        break;
                    }
                    flag = true;
                    for (int j = 1; j <= distant; j++) {
                        if (parkMap[pos.x][pos.y + j].equals("X")) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        pos.y += distant;
                    }
                    break;
                case "W":
                    if (pos.y - distant < 0) {
                        break;
                    }
                    flag = true;
                    for (int j = 1; j <= distant; j++) {
                        if (parkMap[pos.x][pos.y - j].equals("X")) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        pos.y -= distant;
                    }
                    break;
                case "S":
                    if (pos.x + distant >= h) {
                        break;
                    }
                    flag = true;
                    for (int j = 1; j <= distant; j++) {
                        if (parkMap[pos.x + j][pos.y].equals("X")) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        pos.x += distant;
                    }
                    break;
                case "N":
                    if (pos.x - distant < 0) {
                        break;
                    }
                    flag = true;
                    for (int j = 1; j <= distant; j++) {
                        if (parkMap[pos.x - j][pos.y].equals("X")) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        pos.x -= distant;
                    }
                    break;
                default:
                    break;
            }
        }

        return new int[]{pos.x, pos.y};
    }

    class Pos {
        public int x;
        public int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}