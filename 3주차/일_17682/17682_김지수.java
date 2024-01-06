// Solution 1
class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int scoreIdx = -1;

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (Character.isDigit(c)) {
                scoreIdx++;
                if (c == '1' && dartResult.charAt(i + 1) == '0') {
                    scores[scoreIdx] = 10;
                    i++;
                } else {
                    scores[scoreIdx] = c - '0';
                }
            } else if (c == 'D') {
                scores[scoreIdx] = (int) Math.pow(scores[scoreIdx], 2);
            } else if (c == 'T') {
                scores[scoreIdx] = (int) Math.pow(scores[scoreIdx], 3);
            } else if (c == '*') {
                scores[scoreIdx] *= 2;
                if (scoreIdx >= 1) scores[scoreIdx - 1] *= 2;
            } else if (c == '#') {
                scores[scoreIdx] *= -1;
            }
        }

        int answer = 0;
        for (int score : scores) {
            answer += score;
        }

        return answer;
    }
}


// Solution 2
import java.util.*;
class Solution {
    public int solution(String dartResult) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < dartResult.length(); ++i) {
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                sum = (c - '0');
                if (sum == 1 && i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '0') {
                    sum = 10;
                    i++;
                }
                stack.push(sum);
            } else {
                int prev = stack.pop();
                if (c == 'D') {
                    prev *= prev;
                } else if (c == 'T') {
                    prev = prev * prev * prev;
                } else if (c == '*') {
                    if (!stack.isEmpty()) {
                        int val = stack.pop() * 2;
                        stack.push(val);
                    }
                    prev *= 2;
                } else if (c == '#') {
                    prev *= (-1);
                }
                // System.out.println(prev);
                stack.push(prev);
            }
        }
        int totalScore = 0;
        while (!stack.isEmpty()) {
            totalScore += stack.pop();
        }
        return totalScore;
    }
}


// Solution 3
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Solution {
    static int[] sum = new int[3];
    static int solution(String msg) {
        String reg = "([0-9]{1,2}[S|T|D][*|#]{0,1})";
        Pattern p = Pattern.compile(reg+reg+reg);
        Matcher m = p.matcher(msg);
        m.find(); // 패턴에 맞는 부분을 찾음
        for (int i = 1; i <= m.groupCount(); i++) { // 찾은 부분을 순회하며 처리
            Pattern p1 = Pattern.compile("([0-9]{1,2})([S|T|D])([*|#]{0,1})");
            Matcher m1 = p1.matcher(m.group(i)); // 그룹0: 전체 매칭된 문자열 / 그룹1: [0-9]{1,2} / 그룹2: [S|T|D] / 그룹3: [*|#]{0,1}
            m1.find();
            sum[i-1] = (int) Math.pow(Integer.parseInt(m1.group(1)), getpow(m1.group(2)));
            setting(i,m1.group(3));
        }
        return (sum[0]+ sum[1]+ sum[2]);
    }
    static void setting(int idx, String msg){
        if (msg.equals("*")) {
            sum[idx - 1] *= 2;
            if (idx > 1) {
                sum[idx - 2] *= 2;
            }
        }
        else if (msg.equals("#")) {
            sum[idx - 1] *= -1 ;
        }
    }
    static int getpow(String mag) {
        if (mag.equals("S")) {
            return 1;
        }
        else if (mag.equals("D")) {
            return 2;
        }
        else {
            return 3;
        }
    }
}