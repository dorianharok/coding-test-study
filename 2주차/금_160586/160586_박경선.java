import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] spell = new int[26];

        for(int i=0;i<keymap.length; i++){
            for(int j=0; j<keymap[i].length(); j++){
                if(spell[keymap[i].charAt(j) - 'A'] != 0){
                    spell[keymap[i].charAt(j) - 'A'] = Math.min(spell[keymap[i].charAt(j) - 'A'], j+1);
                }
                if(spell[keymap[i].charAt(j) - 'A'] == 0){
                    spell[keymap[i].charAt(j) - 'A'] = j+1;
                }
            }
        }
        int[] answer = new int[targets.length];
        for(int i=0; i<targets.length; i++){
            int sum = 0;
            for (int j=0; j<targets[i].length(); j++) {
                if(spell[targets[i].charAt(j) - 'A'] == 0) {
                    sum = -1;
                    break;
                }
                sum+=spell[targets[i].charAt(j) - 'A'];
            }

            answer[i] = sum;
        }


        return answer;
    }
}

