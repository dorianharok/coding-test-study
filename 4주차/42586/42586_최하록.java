import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] arr = new int[progresses.length];
        int length = progresses.length;

        for(int i=0; i < length; i++) {
            arr[i] = (int)Math.ceil((100 - progresses[i]) / (double)speeds[i]);
        }

        List<Integer> list = new ArrayList<>();
        int pre = arr[0];
        int idx = 0;

        for(int i=1; i < length; i++) {
            if(arr[i] <= pre) {
                continue;
            }

            list.add(i - idx);
            pre = arr[i];
            idx = i;
        }

        list.add(length - idx);

        return list.stream().mapToInt(i->i).toArray();
    }
}