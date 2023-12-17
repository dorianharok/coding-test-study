class Solution {
    // 답안 참고
    public int solution(String[] babbling) {
        String[] nephew =  {"aya", "ye", "woo", "ma"};
        int cnt= 0;
        for(int i=0; i<babbling.length;i++){
            // 연속되는 부분은 카운팅 되지 않도록 이렇게 앞에서 먼저 처리해준다!
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo")||babbling[i].contains("mama")) continue;
            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].replace(" ", "");
            if(babbling[i].isEmpty()) cnt++;
        }
        return cnt;
    }
}