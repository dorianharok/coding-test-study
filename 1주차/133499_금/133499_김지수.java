// Solution 1
class Solution {
    public int solution(String[] babbling) {
        // pronounceable 배열 안의 원소에 있어야 함
        // 같은 원소 연속 X
        String[] pronounceable = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String b : babbling) {
            boolean foundRepeat = false;

            for (String p : pronounceable) {
                if (b.contains(p.repeat(2))) {
                    foundRepeat = true;
                    break;
                }
            }
            if (foundRepeat) {
                continue;
            }
            for (String p : pronounceable) {
                b = b.replace(p, " ").trim();
                // b = b.replace(p, "");
                // b = b.replace(p, "").trim();
                // 위에 둘 다 안 됨! 왜지?
                // 이유) "awooya" => "aya" 이렇게 될 수 있다~

            }
            if (b.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
/* 시간 복잡도: O(N) => N은 babbling 배열에 있는 모든 문자열의 길이의 합 */


// Solution 2
class Solution {
    public int solution(String[] babblings) {
        // "aya", "ye", "woo", "ma" 4가지 발음만 가능
        int answer = 0;
        for(int i = 0; i < babblings.length; i++) {
            if(babblings[i].contains("ayaaya") || babblings[i].contains("yeye") || babblings[i].contains("woowoo") || babblings[i].contains("mama")) {
                continue;
            }

            babblings[i] = babblings[i].replace("aya", " ");
            babblings[i] = babblings[i].replace("ye", " ");
            babblings[i] = babblings[i].replace("woo", " ");
            babblings[i] = babblings[i].replace("ma", " ");
            babblings[i] = babblings[i].replace(" ", "");

            if(babblings[i].length()  == 0) answer++;

        }
        return answer;
    }
}


// Solution 3
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            babbling[i] = babbling[i].replaceAll("ayaaya|yeye|woowoo|mama","1");
            babbling[i] = babbling[i].replaceAll("aya|ye|woo|ma"," ");
            babbling[i] = babbling[i].replaceAll(" ","");
            if(babbling[i].equals("")) answer++;
        }
        return answer;
    }
}