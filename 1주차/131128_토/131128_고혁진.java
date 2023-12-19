class Solution {
    public String solution(String X, String Y) {
        int numx[]={0,0,0,0,0,0,0,0,0,0};
        int numy[]={0,0,0,0,0,0,0,0,0,0};
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<X.length();i++){
            numx[(int) X.charAt(i) - '0']+=1;
        }
        for(int i=0;i<Y.length();i++){
            numy[(int) Y.charAt(i) - '0']+=1;
        }
        for(int i=9;i>=0;i--){
            int num=0;
            if(numx[i]!=0&&numy[i]!=0)
                num=numx[i]>numy[i]?numy[i]:numx[i];
            for(int k=0;k<num;k++) {
                sb.append(i);
            }
        }
        if(sb.length() == 0) return "-1";
        else if(sb.charAt(0) == '0') return "0";
        return sb.toString();
    }
}