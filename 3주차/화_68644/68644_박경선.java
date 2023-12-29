import java.util.stream.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] check = new int[200];
        for(int i=0; i< numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                check[numbers[i]+numbers[j]]++;
            }
        }
        return IntStream.range(0, check.length)
                .filter(i -> check[i] > 0)
                .toArray();
    }
}