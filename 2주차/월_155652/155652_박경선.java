class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            for(int i=0; i<index; i++){
                c += 1;
                if(c > 'z') c-=26;
                if(skip.contains(String.valueOf(c)))i--;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
