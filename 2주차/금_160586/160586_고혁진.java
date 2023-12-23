class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] alphabet = new int[26];
        for(int i=0;i<26;i++){
            char target = (char)('A'+i);
            alphabet[i] = Integer.MAX_VALUE;
            for(String key : keymap){
                int min = key.indexOf(target) + 1;
                if(min !=0){
                    alphabet[i] = Math.min(alphabet[i],min);
                }
            }
        }
        for(int i=0; i<targets.length;i++){
            int sum = 0;
            for(int j=0; j<targets[i].length(); j++){
                char target = targets[i].charAt(j);
                int min = alphabet[target-'A'];
                if(min == Integer.MAX_VALUE){
                    sum = -1;
                    break;
                }
                sum += min;
            }
            answer[i] = sum;
        }
        return answer;
    }
}