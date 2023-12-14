import java.util.*;
class Solution {
    public int solution(int[] ingredients) {
        int cnt = 0;
        Stack<Integer> hamburger = new Stack<>();
        for(int i=0; i<ingredients.length; i++){
            hamburger.push(ingredients[i]);
            if(hamburger.size()>=4){
                if(checkHamburger(hamburger.size()-4, hamburger)) {
                    cnt++;
                    hamburger.pop();
                    hamburger.pop();
                    hamburger.pop();
                    hamburger.pop();
                }

            }
        }
        return cnt;
    }
    private static boolean checkHamburger(int index, Stack<Integer> ingredients){
        int[] wrapping = {1,2,3,1};
        for(int i = index, j=0; j<wrapping.length; i++, j++){
            if(!ingredients.get(i).equals(wrapping[j])) return false;
        }
        return true;
    }
}