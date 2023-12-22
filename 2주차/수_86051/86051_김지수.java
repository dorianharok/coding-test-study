// Solution 1
import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        List<Integer> numbersList = new ArrayList<>();
        for (int num : numbers) {
            numbersList.add(num);
        }
        int answer = 0;
        for (int i = 0; i <= 9; i++) {
            if (!numbersList.contains(Integer.valueOf(i))) answer += i;
        }
        return answer;
    }
}


// Solution 2
class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}


// Solution 3
import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        return 45-Arrays.stream(numbers).sum();
    }
}