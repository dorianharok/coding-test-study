import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        char[] ch = new char[strings.length];
        Arrays.sort(strings);
        String[] answer = new String[strings.length];

        for(int i=0; i<strings.length; i++){
            ch[i] = strings[i].charAt(n);
        }
        Arrays.sort(ch);
        //a e u
        for(int i=0; i<strings.length; i++){
            for(int j=0; j<strings.length; j++){
                if(ch[i]==strings[j].charAt(n)){
                    answer[i]=strings[j];
                    strings[j]=" ";
                }
            }
        }

        return answer;
    }
} 
//실패한 코드
import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);

            if (c1 == c2) {
                return s1.compareTo(s2); // n번째 문자가 같으면 전체 문자열을 기준으로 정렬
            } else {
                return Character.compare(c1, c2);
            }
        });

        return strings;
    }
}
