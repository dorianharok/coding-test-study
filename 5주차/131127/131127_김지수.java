// Solution 1
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        for (int i = 0; i < discount.length - 9; i++) {
            int cntDay = 0;

            for (int j = 0; j < want.length; j++) {
                int cnt = 0;

                for (int k = i; k < i + 10; k++) {
                    if (discount[k].equals(want[j])) cnt++;
                }

                if (cnt < number[j]) break;
                else cntDay++;
            }
            if (cntDay == want.length) answer++;
        }

        return answer;
    }
}


// Solution 2 하록님 풀이 퍼가욥~
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> wantMap = new HashMap<>();
        for(int i=0; i<want.length; i++){
            wantMap.put(want[i], i);
        }

        int total = Arrays.stream(number).sum();

        int answer = 0;

        for(int i = 0; i <= discount.length - total; i++) {
            if(!wantMap.containsKey(discount[i])){
                continue;
            }

            int[] arr = new int[number.length];
            for(int j = i; j < i+total; j++) {
                if(!wantMap.containsKey(discount[j])){
                    break;
                }

                arr[wantMap.get(discount[j])]++;

                if(Arrays.equals(arr, number)) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}