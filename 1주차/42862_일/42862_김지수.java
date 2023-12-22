// Solution
import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] arr = new int[n + 1];
        int answer = 0;

        for (int l : lost) {
            arr[l]--;
        }
        for (int r : reserve) {
            arr[r]++;
        }

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < 0) {
                if (arr[i-1] == 1) {
                    arr[i-1]--;
                    arr[i]++;
                } else if (i+1 < arr.length && arr[i+1] == 1) {
                    arr[i+1]--;
                    arr[i]++;
                }
            }
            if(arr[i] >= 0) answer++;
        }

        return answer;
    }
}