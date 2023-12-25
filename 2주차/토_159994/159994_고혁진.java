class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int i = 0;
        int j = 0;
        int k = 0;
        while(k<goal.length){
            if(i < cards1.length&&goal[k].equals(cards1[i])){
                k++;
                i++;
            } else if(j < cards2.length&&goal[k].equals(cards2[j])){
                k++;
                j++;
            } else break;
        }
        if(k==goal.length){
            answer+="Yes";
        }
        else{
            answer+="No";
        }
        return answer;
    }
}