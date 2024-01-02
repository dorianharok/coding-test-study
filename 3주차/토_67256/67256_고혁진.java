import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left=10;
        int right=12;
        for(int i=0;i<numbers.length;i++){
            int now=numbers[i];
            if(now==1||now==4||now==7){
                answer+="L";
                left = now;
            }else if(now==3||now==6||now==9){
                answer+="R";
                right = now;
            }else {
                if(now==0) now=11;
                int ldistance = Math.abs(now-left)/3+Math.abs(now-left)%3;
                int rdistance = Math.abs(now-right)/3+Math.abs(now-right)%3;

                if(ldistance<rdistance){
                    answer+="L";
                    left = now;
                }else if(ldistance>rdistance){
                    answer+="R";
                    right = now;
                }else{
                    if(hand.equals("left")){
                        answer+="L";
                        left = now;
                    }else{
                        answer+="R";
                        right = now;
                    }
                }
            }
        }
        return answer;
    }
}