// Solution 1
class Solution1 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}
// (signs[i]) ?  answer += absolutes[i] : answer -= absolutes[i];
// => 불가능! 이유: +=와 -=는 할당 연산자로, 삼항 연산자의 피연산자로 사용할 수 없음. 삼항 연산자는 값을 반환하므로 왼쪽 피연산자에 변수가 필요함
// => answer = (signs[i]) ?  answer + absolutes[i] : answer - absolutes[i]; 이렇게 하면 가능


// Solution 2
class Solution2 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1);
        return answer;
    }
}


// Solution 3
class Solution3 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer += (signs[i]) ? absolutes[i] : -absolutes[i];
        }
        return answer;
    }
}