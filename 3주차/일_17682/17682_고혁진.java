import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        char cc[] = dartResult.toCharArray();
        int score [] = {0,0,0};
        int cnt=0;
        String s="";

        for(int i=0; i<cc.length; i++){
            if(Character.isDigit(cc[i]) == true)
            {
                s += cc[i];
            }
            else if (cc[i]=='S'||cc[i]=='D'||cc[i]=='T') { // S,D,T 일 때
                score[cnt] = Integer.parseInt(s);
                if (cc[i]=='D') score[cnt]= score[cnt]*score[cnt];
                if (cc[i]=='T') score[cnt]= score[cnt]*score[cnt]*score[cnt];
                if (i!=cc.length-1){
                    if (cc[i+1]=='*') {
                        if(cnt != 0)
                            score[cnt-1] *=2;
                        score[cnt] *=2;
                    }
                    if (cc[i+1]=='#') score[cnt] *= (-1);
                }
                cnt++;
                s="";
            }
        }
        for(int i:score){
            answer += i;
        }

        return answer;
    }
}
//답 봐버림 ㅜ