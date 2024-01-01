class Solution {
    public int solution(String dartResult) {
        String s = "";
        int[] score = new int[3];
        int idx = 0;
        for(int i=0; i<dartResult.length(); i++){
            switch (dartResult.charAt(i)){
                case '*':
                    score[idx-1]*=2;
                    if(idx>1) score[idx-2]*=2;
                    break;
                case '#':
                    score[idx-1]*=-1;
                    break;
                case 'S':
                    score[idx] = (int)Math.pow(Integer.parseInt(s),1);
                    idx++;
                    s="";
                    break;
                case 'D':
                    score[idx] = (int)Math.pow(Integer.parseInt(s),2);
                    idx++;
                    s="";
                    break;
                case 'T':
                    score[idx] = (int)Math.pow(Integer.parseInt(s),3);
                    idx++;
                    s="";
                    break;
                default:
                    s+=String.valueOf(dartResult.charAt(i));
                    break;
            }
        }
        int answer = 0;
        for(int i=0; i<score.length; i++){
            answer+=score[i];
        }
        return answer;
    }
}