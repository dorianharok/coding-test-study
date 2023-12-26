import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int[] weapon = new int[number+1];
        for(int i=1; i<=number; i++){
            for(int j=0; j<=number; j+=i){
                if(j%i==0) weapon[j]++;
            }
        }
        weapon[0] =0;
        for(int i=1; i<weapon.length; i++){
            if(weapon[i] > limit) weapon[i] = power;
        }
        return Arrays.stream(weapon).sum();
    }

}