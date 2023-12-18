class Solution {
    public String solution(String X, String Y) {
        // 런타임 오류 때문에 계속 못풀어서 힌트 참고
        // 문자 00을 0으로 만들기 위해 Integer.parseInt를 사용하고 이걸 또 문자열로 만들기위해
        // String.valueOf(Integer.parseInt(sb.toString())) 이렇게 하니까 오류..
        int[] arrX = new int[10];
        int[] arrY = new int[10];

        for(int i=0; i<X.length(); i++){
            arrX[X.charAt(i) - '0']++;
        }
        for(int i=0; i<Y.length(); i++){
            arrY[Y.charAt(i) - '0']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=9; i>=0; i--){
            int cnt = Math.min(arrX[i], arrY[i]);
            sb.append(String.valueOf(i).repeat(Math.max(0, cnt)));
        }
        String result = sb.toString();
        if(result.isEmpty()) return "-1";
        if(result.charAt(0) == '0') return "0";
        return result;
    }
}