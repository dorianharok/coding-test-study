class Solution {
    public String solution(String s, int n) {
        // 주의! n이 커지면 정확한 답이 안나옴 예외케이스 solution("P", 15) 예상답 : "E"
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                int idx = s.charAt(i) + n;
                if('A' <= idx && idx <= 'Z'){
                    sb.append((char)(idx));
                }else{
                    sb.append((char)(idx % 'Z' + 'A' -1));
                }
            }else if(Character.isLowerCase(s.charAt(i))){
                int idx = s.charAt(i) + n;
                if(idx > 'z'){
                    sb.append((char)(idx % 'z' + 'a' -1));
                }else{
                    sb.append((char)(idx));
                }
            }else{
                sb.append(s.charAt(i));
            }
        }
        // A : 65 ~ 90
        // a : 97 ~ 122

        return sb.toString();
    }
}