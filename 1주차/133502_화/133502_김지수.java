import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        /* 빵 1 야채 2 고기 3 빵 1 */

        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int i : ingredient) {
            list.add(i);
            while (list.size() >= 4) {
                int n = list.size();
                if (!(list.get(n-4) == 1
                        && list.get(n-3) == 2
                        && list.get(n-2) == 3
                        && list.get(n-1) == 1)) break;
                for (int j = 0; j < 4; j++) {
                    list.remove(list.size() - 1);
                }
                answer++;
            }
        }
        return answer;
    }

    // 시간 복잡도: O(N) => ingredient 배열의 길이
}