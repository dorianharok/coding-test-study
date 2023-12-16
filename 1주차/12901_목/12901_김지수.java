// Solution 1
class Solution1 {
    public String solution(int a, int b) {
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfTheWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        int totalDay = 0;
        for (int i = 0; i < a - 1; i++) {
            totalDay += months[i];
        }
        totalDay += b - 1;

        return dayOfTheWeek[totalDay%7];
    }
}
/* 시간복잡도: O(a-1) */


// Solution 2
import java.time.*;
class Solution {
    public String solution(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
    }
}
/* ㅋㅋㅋ 이게 자바다~ */

