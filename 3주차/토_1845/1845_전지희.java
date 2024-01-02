import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int maxCount = nums.length / 2;
        
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int uniqueCount = countMap.size();
        
        answer = Math.min(uniqueCount, maxCount);
        
        return answer;
    }
}
