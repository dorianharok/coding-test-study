class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.replace(" ", "1");
        int cnt = 0;
        char[] charArray = s.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if(Character.isDigit(charArray[i])) {
                sb.append(" ");
                cnt=0;
            }
            else{
                if(cnt%2 == 0 ) sb.append(String.valueOf(charArray[i]).toUpperCase());
                else sb.append(String.valueOf(charArray[i]).toLowerCase());
                cnt++;
            }
        }
        return sb.toString();
    }
}