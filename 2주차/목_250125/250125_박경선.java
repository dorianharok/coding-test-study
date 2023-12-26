class Sollution{
    public int solution(String[][] board, int w, int h){

        int[] dx = {1, 0, 0, -1};
        int[] dy = {0, 1, -1, 0};
        int cnt = 0;
        for(int i=0; i<4; i++){
            int nx = h+dx[i];
            int ny = w+dy[i];
            if(nx<0 | ny <0 | nx >= board.length | ny >= board.length) continue;
            if(board[nx][ny].equals(board[h][w])) cnt++;
        }
        return cnt;
    }

}
