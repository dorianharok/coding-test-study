import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        String[][] arr = new String[park.length][park[0].length()];
        Queue<Position> q = new LinkedList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = String.valueOf(park[i].charAt(j));
                if(arr[i][j].equals("S")) q.add(new Position(i,j));
            }
        }

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,1,-1};
        HashMap<String, Integer> map = new HashMap<>();
        map.put("N", 0);
        map.put("S", 1);
        map.put("E", 2);
        map.put("W", 3);

        for (String route : routes) {
            String[] routeInfo = route.split(" ");
            String direction = routeInfo[0]; //방향
            int idx = map.get(direction);
            int distance = Integer.parseInt(routeInfo[1]);//거리
            Position p = q.poll();

            // 이동할 위치
            int moveX = p.x + dx[idx]*distance;
            int moveY = p.y + dy[idx]*distance;

            // 이동하는 과정에서 발생할 예외체크
            boolean flag = true;
            for(int i=1; i<=distance;i++){
                int nx = p.x + dx[idx] * i;
                int ny = p.y + dy[idx] * i;
                if(nx < 0 || ny < 0 || nx >= arr.length|| ny >= arr[0].length) {
                    flag = false;
                    break;
                }
                if(arr[nx][ny].equals("X")) {
                    flag = false;
                    break;
                }
            }
            if(!flag) {
                // 이동이 불가능하다면
                q.add(new Position(p.x, p.y));
                continue;
            }
            // 이동이 가능하다면
            q.add(new Position(moveX, moveY));
        }

        Position answer = q.poll();
        return new int[]{answer.x, answer.y};
    }
}
class Position{
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

}