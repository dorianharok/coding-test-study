// Solution 1
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        for (String route : routes) {
            String[] arr = route.split(" ");
            int move = Integer.parseInt(arr[1]);
            switch(arr[0]) {
                case "E" :
                    if (y + move < park[0].length() && park[x].charAt(y + move) != 'X') {
                        for (int i = 0; i < move; i++) {
                            if (park[x].charAt(y) == 'X') {
                                y -= i;
                                break;
                            }
                            y++;
                        }
                    }
                    break;

                case "W" :
                    if (y - move >= 0 && park[x].charAt(y - move) != 'X') {
                        for (int i = 0; i < move; i++) {
                            if (park[x].charAt(y) == 'X') {
                                y += i;
                                break;
                            }
                            y--;
                        }
                    }
                    break;

                case "S" :
                    if (x + move < park.length && park[x + move].charAt(y) != 'X') {
                        for (int i = 0; i < move; i++) {
                            if (park[x].charAt(y) == 'X') {
                                x -= i;
                                break;
                            }
                            x++;
                        }
                    }
                    break;

                case "N" :
                    if (x - move >= 0 && park[x - move].charAt(y) != 'X') {
                        for (int i = 0; i < move; i++) {
                            if (park[x].charAt(y) == 'X') {
                                x += i;
                                break;
                            }
                            x--;
                        }
                    }
                    break;

                default :
                    break;
            }
        }
        return new int[]{x, y};
    }
}


// Solution 2 다시 보기!
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();

        int startH = 0;
        int startW = 0;

        for(int i = 0; i < h; i++){
            if(park[i].contains("S")){
                startH = i;
                startW = park[i].indexOf("S");
            }
        }

        for(String route : routes){
            String d = route.split(" ")[0];
            int move = Integer.parseInt(route.split(" ")[1]);

            int moveH = startH;
            int moveW = startW;

            for(int i = 0; i < move; i++){
                switch(d) {
                    case "S" : moveH++; break;
                    case "N" : moveH--; break;
                    case "E" : moveW++; break;
                    case "W" : moveW--; break;
                }
                if(moveH >= 0 && moveH < h && moveW >= 0 && moveW < w){
                    if(park[moveH].substring(moveW, moveW+1).equals("X")){
                        break;
                    }
                    if(i == move - 1){
                        startH = moveH;
                        startW = moveW;
                    }
                }
            }
        }

        int[] answer = {startH, startW};
        return answer;
    }
}


// Solution 3 다시 보기!!
import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int m = park.length;
        int n = park[0].length();
        int curX = 0;
        int curY = 0;
        char[][] grid = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = park[i].charAt(j);
                if (grid[i][j] == 'S') {
                    curX = i;
                    curY = j;
                }
            }
        }

        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('N', 0);
        map.put('S', 1);
        map.put('W', 2);
        map.put('E', 3);

        for (String command : routes) {
            char op = command.charAt(0);
            int move = command.charAt(2) - '0';

            int nextX = curX;
            int nextY = curY;
            boolean isOK = true;
            
            for (int i = 0; i < move; i++) {
                nextX += dx[map.get(op)];
                nextY += dy[map.get(op)];

                if (nextX < 0 || nextY < 0 || nextX >= m || nextY >= n || grid[nextX][nextY] == 'X') {
                    isOK = false;
                    break;
                }
            }

            if (isOK) {
                curX = nextX;
                curY = nextY;
            }
        }

        return new int[] { curX, curY };
    }
}
