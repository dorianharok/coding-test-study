import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int n = arr.length;
        if (n <= 1) {
            return arr;
        }

        int[] result = new int[n];
        int resultIndex = 0;

        result[resultIndex++] = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                result[resultIndex++] = arr[i];
            }
        }

        return Arrays.copyOf(result, resultIndex);
    }
}
