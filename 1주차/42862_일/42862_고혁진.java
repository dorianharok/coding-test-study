import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for(int i=0; i<lost.length; i++){
            for(int k=0; k<reserve.length; k++){
                if(reserve[k]==lost[i]){
                    answer+=1;
                    reserve[k]=-1;
                    lost[i]=-1;
                }
            }
        }
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==-1)
                    break;
                else if((reserve[j]==lost[i]-1)||(reserve[j]==lost[i]+1)){
                    answer+=1;
                    reserve[j]=-1;
                    break;
                }
            }
        }
        return answer;
    }
}
//오 14점 올랐어요!