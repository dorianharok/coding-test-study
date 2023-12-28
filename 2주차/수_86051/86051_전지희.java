import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        int answer = 0;

        for (int i = 0; i <= 9; i++) {
            int index = Arrays.binarySearch(numbers, i);

            if (index < 0) {
                answer += i;
            }
        }

        return answer;
    }
}
