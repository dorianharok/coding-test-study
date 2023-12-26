class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(int i = 0; i <s.length(); i++){
            if(s.charAt(i)==' '){
                cnt=0;
                sb.append(' ');
                continue;
            }
            if(cnt%2==0){
                sb.append(Character.toUpperCase(s.charAt(i)));
                cnt++;
            }
            else{
                sb.append(Character.toLowerCase(s.charAt(i)));
                cnt++;
            }

        }
        return sb.toString();
    }
}