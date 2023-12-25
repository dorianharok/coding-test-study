import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        int s = -1;
        for(int i=0 ; i<arr.length;i++){
            if(s != arr[i]){
                list.add(arr[i]);
                s = arr[i];
            }
        }
        int[] answer = new int[list.size()];
        for(int k = 0; k < list.size(); k++){
            answer[k] = list.get(k);
        }
        return answer;
    }
}