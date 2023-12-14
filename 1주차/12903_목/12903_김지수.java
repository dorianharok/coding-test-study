// 알게 된 것 1 : charAt()으로 얻은 두 문자를 더할 때 + 연산자를 사용하면 정수로 변환되어 ASCII 값이 더해진다. 따라서 Character.toString() 혹은 String.valueOf()로 한 번 변환을 거쳐줘야 한다.
// 알게 된 것 2 : 자바에서는 문자열과 다른 데이터 타입을 더할 때 자동으로 문자열로 변환된다.

// Solution 1
class Solution1 {
    public String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 0) {
            answer += s.charAt(s.length() / 2 - 1);
            answer += s.charAt(s.length() / 2);
        } else {
            answer += s.charAt(s.length() / 2);
        }
        return answer;
    }
}
/* 시간복잡도: O(1) */

// Solution 2
class Solution2 {
    public String solution(String s) {
        return s.substring((s.length()-1)/2, word.length()/2 + 1);
    }
}
/* 시간복잡도: O(1) */

// Solution 3
class Solution3 {
    public String solution(String s) {
        int a = s.length();
        String answer;

        if ( a % 2 == 0 )
            answer = s.substring((a/2) - 1, (a/2) + 1);
        else
            answer = s.substring((a/2), (a/2) + 1);

        return answer;
    }
}
/* 시간복잡도: O(1) */