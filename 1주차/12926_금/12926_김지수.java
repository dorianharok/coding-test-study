// Solution 1
class Solution {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            // 알파벳이 순환하는 기준을 'A', 'a'로 고정('Z' 다음은 '[', 'z' 다음은 '{' 라서)
            if (Character.isUpperCase(c)) {
                chars[i] = (char) ('A' + (c + n - 'A') % 26);
            } else if (Character.isLowerCase(c)) {
                chars[i] = (char) ('a' + (c + n - 'a') % 26);
            }
        }
        return new String(chars);
    }
}
/* 시간복잡도: O(n) */


// Solution 2
class Solution {
    public String solution(String s, int n) {
        String result = "";
//        n = n % 26;  이 부분은 애초에 n 입력값이 25 이하라서 필요 없음

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            result += ch;
        }
        return result;
    }
}
/* 시간복잡도: O(n) */