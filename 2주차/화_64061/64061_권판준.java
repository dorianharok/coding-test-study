public class No_64061 {
    public int solution(int[][] board, int[] moves) {
        int popCnt = 0;

        Stack[] rowList = new Stack[board.length];
        int rowIndex = 0;
        for (int i = 0; i < board.length; i++) {
            rowList[rowIndex] = new Stack();
            for (int j = 0; j < board.length; j++) {
                if(board[board.length-1 - j][i] != 0) {
                    rowList[rowIndex].push(board[board.length-1 - j][i]);
                }
            }
            rowIndex++;
        }

        Stack basket = new Stack();
        for (int i = 0; i < moves.length; i++) {
            int item;
            if (!rowList[moves[i] - 1].isEmpty()) {
                item = (int) rowList[moves[i] - 1].pop();
            } else {
                continue;
            }

            if (!basket.isEmpty() && (int) basket.peek() == item) {
                basket.pop();
                popCnt++;
            } else {
                basket.push(item);
            }
        }

        return popCnt * 2;
    }
}