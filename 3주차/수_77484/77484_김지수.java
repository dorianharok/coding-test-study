// Solution 1
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};
        int cntWin = 0;
        int cnt0 = 0;

        for (int l : lottos) {
            if (l == 0) {
                cnt0++;
                continue;
            }
            for (int w : win_nums) {
                if (l == w) {
                    cntWin++;
                }
            }
        }
        answer[0] = (cntWin + cnt0 == 0) ? 6 : 7 - (cntWin + cnt0);
        answer[1] = (cntWin == 0) ? 6 : 7 - cntWin;

        return answer;
    }
}


// Solution 2 성능 굿
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int cnt0 = 0;
        for (int l : lottos) {
            if (l == 0) {
                cnt0++;
                continue;
            }
            map.put(l, true);
        }

        int cntWin = 0;
        for (int w : win_nums) {
            if (map.containsKey(w)) cntWin++;
        }

        int maxRank = 7 - (cntWin + cnt0);
        int minRank = 7 - cntWin;
        if (maxRank > 6) maxRank = 6;
        if (minRank > 6) minRank = 6;

        return new int[]{maxRank, minRank};
    }
}


// Solution 3 가독성 굿
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int cnt0 = 0;
        int cntWin = 0;
        for(int l : lottos) {
            if(l == 0) {
                cnt0++;
                continue;
            }
            for(int w : win_nums) {
                if(l == w) cntWin++;
            }
        }

        answer[0] = getGrade(cnt0 + cntWin);
        answer[1] = getGrade(cntWin);

        return answer;
    }

    public int getGrade(int n) {
        switch(n) {
            case 6 :
                return 1;
            case 5 :
                return 2;
            case 4 :
                return 3;
            case 3 :
                return 4;
            case 2 :
                return 5;
            default :
                return 6;
        }
    }
}


// Solution 4
import java.util.Arrays;
import java.util.stream.LongStream;
class Solution {
    public int[] solution(int[] lottos, int[] winNums) {
        return LongStream.of(
                        (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(winNums).anyMatch(w -> w == l) || l == 0).count(),
                        (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(winNums).anyMatch(w -> w == l)).count()
                )
                .mapToInt(op -> (int) (op > 6 ? op - 1 : op))
                .toArray();
    }
}