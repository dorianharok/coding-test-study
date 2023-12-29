// Solution 1
class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            sb.append(String.valueOf(i).repeat(food[i]/2));
        }
        String answer = sb + "0";
        return answer + sb.reverse();
    }
}
/* 시간복잡도: O(N + M) => N: food 배열의 길이, M: sb의 길이(sb.reverse() 메소드) */


// Solution 2
class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            sb.append(Integer.toString(i).repeat(food[i] / 2));
        }
        return sb.toString() + "0" + sb.reverse().toString();
    }

}
/* 시간복잡도: O(N + M) => N: food 배열의 길이, M: sb의 길이(sb.reverse() 메소드) */


// Solution 3
class Solution {
    public String solution(int[] food) {
        String answer = "0";
        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }
        return answer;
    }
}
/* 시간복잡도: O(N + M) => N: food 배열의 길이, M: food 배열의 요소 중 가장 큰 값 */