// Solution 1
import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 1) + 1);
        }
        return (map.size() <= nums.length / 2) ? map.size() : nums.length / 2;
    }
}


// Solution 2
import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int num : nums) {
            hs.add(num);
        }
        return (hs.size() <= nums.length / 2) ? hs.size() : nums.length / 2;
    }
}


// Solution 3
import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
    }
}


