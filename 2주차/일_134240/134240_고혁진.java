class Solution {
    public String solution(int[] food) {
        String answer = "0";
        for(int i=food.length-1; i>=1;i--){
            if(food[i] / 2 > 0) {
                String s = String.valueOf(i);
                for(int j =0; j<food[i]/2;j++) {
                    answer = s + answer + s;
                }
            }
        }
        return answer;
    }
}