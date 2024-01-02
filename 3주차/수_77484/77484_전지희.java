import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int zeroCount = (int) Arrays.stream(lottos).filter(num -> num == 0).count();
        int correctCount = (int) Arrays.stream(lottos)
                .filter(num -> Arrays.stream(win_nums).anyMatch(winNum -> winNum == num))
                .count();
        
        int maxRank = getRank(correctCount + zeroCount);
        int minRank = getRank(correctCount);
        
        answer[0] = maxRank;
        answer[1] = minRank;
        
        return answer;
    }
    
    private int getRank(int count) {
        switch (count) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}
