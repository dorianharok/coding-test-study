class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long j = Long.parseLong(p);
        String k;
        for(int i=0; i<t.length()-p.length()+1; i++){
            k = t.substring(i,i+p.length());
            if(j>=Long.parseLong(k)){
                answer+=1;
            }
        }
        return answer;
    }
}