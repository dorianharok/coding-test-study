import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] result = new int[(numbers.length*(numbers.length-1))/2];
        int k = 0;
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                result[k]=numbers[i] + numbers[j];
                k++;
            }
        }
        result = Arrays.stream(result).distinct().toArray();
        Arrays.sort(result);
        return result;
    }
}