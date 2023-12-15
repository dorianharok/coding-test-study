class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        for(String s : babbling){
            int cnt =0;
            for(int i=0;i<words.length;i++){
                s = s.replace(words[i],i+"");
            }
            if(!Character.isDigit(s.charAt(0)))
                cnt=-1;
            for(int i=1;i<s.length();i++){
                if(!Character.isDigit(s.charAt(i))) break;
                if(s.charAt(i)==s.charAt(i-1)) break;
                cnt++;
            }
            if(cnt==s.length()-1) answer++;

        }
        return answer;
    }
}
//벽을 느끼고 답을 찾아봄..