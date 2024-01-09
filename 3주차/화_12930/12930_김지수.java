// Solution 1
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ", -1);

        for (int i = 0; i < sArr.length; i++) {
            String str = sArr[i];
            for (int j = 0; j < str.length(); j++) {
                answer += (j % 2 == 0)?
                        String.valueOf(Character.toUpperCase(str.charAt(j))) : String.valueOf(Character.toLowerCase(str.charAt(j)));
            }
            if (i != sArr.length - 1) answer += " ";
        }
        return answer;
    }
}


// Solution 2
class Solution {
    public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }
}


// Solution 3
class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        int idx = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ')
                idx = 0;
            else
                chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]));
        }

        return String.valueOf(chars);
    }
}


// Solution 4
class Solution {
    public String solution(String s) {
        String answer;
        answer = s.toUpperCase();
        char[] chars = answer.toCharArray();

        //앞문자가 대문자라면 소문자로 치환
        for (int i = 1; i < chars.length; i++) {
            if (65 <= chars[i - 1] && chars[i - 1] <= 90) {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        answer = String.valueOf(chars);
        return answer;
    }
}