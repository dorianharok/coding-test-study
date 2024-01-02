public class No_1845 {
    public int solution(int[] nums) {
        int[] array = Arrays.stream(nums).distinct().toArray();

        return array.length > nums.length / 2 ? nums.length / 2 : array.length;
    }
}