import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] result = new int[2];
        int count = (int)Arrays.stream(lottos).filter(i -> i == 0).count();
        int matching = 0;
        for (int lotto : lottos) {
            for(int i=0; i<win_nums.length; i++){
                if(lotto == win_nums[i]) matching++;
            }
        }
        // 최대 당첨 : 0이 모두 당첨 + 매칭수 => count + match
        // 최소 당첨 : 0이 모두 낙첨 + 매칭수 => match
        int[] winning = {6,6,5,4,3,2,1};
        result[0] = winning[count+matching];
        result[1] = winning[matching];

        return result;
    }
}
