import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int mon = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0));
        }
        return Math.min(map.size(), mon);
    }
}