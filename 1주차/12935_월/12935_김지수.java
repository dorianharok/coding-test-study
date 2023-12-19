// Solution 1
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minimum = Math.min(minimum, arr[i]);
        }

        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int a : arr) {
            if (a != minimum) {
                answer[index++] = a;
            }
        }

        return answer;
    }
}
/* 시간복잡도: O(N) */


// Solution 2
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        // getAsInt(): OptionalInt 객체에서 int 값을 가져오는 메서드 / OptionalInt: 기본 타입인 int를 감싸는 래퍼 클래스로, 값이 없을 경우에는 기본값인 0으로 처리
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(e -> e != minimum).toArray;
    }
}
/* 시간복잡도: O(N) */