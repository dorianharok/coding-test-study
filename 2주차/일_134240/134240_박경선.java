class Solution {
    public String solution(int[] food) {
        StringBuilder sb =new StringBuilder();
        for(int i=1; i<food.length; i++){
            int num = food[i] / 2;
            for(int j= 0; j < num; j++){
                sb.append(i);
            }
        }
        StringBuilder reverse = new StringBuilder(sb).reverse();
        sb.append(0);
        sb.append(reverse);
        return sb.toString();
    }
}