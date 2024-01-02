class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt1=7;
        int cnt2=7;

        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                if(lottos[i] == win_nums[j]){
                    cnt1--;
                    cnt2--;
                }
            }
        }
        for(int i=0; i<6; i++){
            if(lottos[i]==0){
                cnt2--;
            }
        }
        answer[0]=(cnt2==7)?6:cnt2;
        answer[1]=(cnt1==7)?6:cnt1;
        return answer;
    }
}