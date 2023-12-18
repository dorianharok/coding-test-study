class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int ycnt=0;
        int pcnt=0;
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)=='y')||(s.charAt(i)=='Y')){
                ycnt+=1;
            }
            else if((s.charAt(i)=='p')||(s.charAt(i)=='P')){
                pcnt+=1;
            }
        }
        if(ycnt!=pcnt){
            answer = false;
        }
        return answer;
    }
}