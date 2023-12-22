// Solution 1
import java.util.*;
class Solution1 {
    public String solution(String X, String Y) {
        // 각 문자열의 문자 빈도를 저장하는 Map
        Map<Character, Integer> charFrequency = new HashMap<>();

        // X 문자열의 문자 빈도만큼 증가
        for (char x : X.toCharArray()) {
            charFrequency.put(x, charFrequency.getOrDefault(x, 0) + 1);
        }

        // Y 문자열의 문자 빈도만큼 감소하면서 공통 문자 찾기
        StringBuilder common = new StringBuilder();
        for (char y : Y.toCharArray()) {
            if (charFrequency.containsKey(y) && charFrequency.get(y) > 0) {
                common.append(y);
                charFrequency.put(y, charFrequency.get(y) - 1);
            }
        }

        // 공통된 문자를 내림차순으로 정렬
        /* 문자열은 기본타입이므로 불변! 우선 문자배열로 바꿔서 정렬 후 문자열로 바꿔주자 */
        char[] commonChars = common.toString().toCharArray();
        Arrays.sort(commonChars);
        String answer = new StringBuilder(new String(commonChars)).reverse().toString();

        return answer.isEmpty() ? "-1" : (answer.replaceAll("0", "").isEmpty() ? "0" : answer);
    }
}
/* 시간복잡도: O(X + Y + ClogC) => C는 공통 원소 개수(만약 이게 상수면 O(X + Y)로 간략화될 수 있음) */


// Solution 2
class Solution2 {
    public String solution(String X, String Y) {
        // 결과를 저장할 StringBuilder 생성
        StringBuilder answer = new StringBuilder();

        // 숫자 0부터 9까지의 빈도를 저장할 배열 초기화
        int[] x = {0,0,0,0,0,0,0,0,0,0};
        int[] y = {0,0,0,0,0,0,0,0,0,0};

        // 문자열 X의 각 숫자의 빈도를 배열 x에 저장
        for(int i=0; i<X.length(); i++){
            x[X.charAt(i)-48] += 1;
        }

        // 문자열 Y의 각 숫자의 빈도를 배열 y에 저장
        for(int i=0; i<Y.length(); i++){
            y[Y.charAt(i)-48] += 1;
        }

        // 숫자 9부터 0까지 역순으로 확인하며 공통된 숫자를 찾아내고, 빈도만큼 answer에 추가
        for(int i=9; i >= 0; i--){
            for(int j=0; j<Math.min(x[i], y[i]); j++){
                answer.append(i);
            }
        }

        // 만약 answer가 빈 문자열이라면 -1을 반환
        if("".equals(answer.toString())){
            return "-1";
        }
        // 만약 answer의 첫 번째 문자가 '0'이라면 0을 반환
        else if(answer.toString().charAt(0) == '0'){
            return "0";
        }
        // 그 외의 경우에는 answer를 문자열로 반환
        else {
            return answer.toString();
        }
    }
}
/* 시간복잡도: O(X + Y) => answer.append(i) 하는 부분은 O(10)인데 상수항이라서 무시  */