import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length ==0 || arr.length == 1) return new int[] {-1};
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i< arr.length;i++){
            min = Math.min(arr[i], min);
        }
        for(int i=0 ;i<arr.length; i++){
            list.add(arr[i]);
            if(arr[i] == min) {
                list.remove(i);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}