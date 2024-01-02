import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class 폰켓몬 {
	public static void main(String[] args) {
		int[] nums = {3,1,2,3};

		print(nums);
	}

	private static void print(int[] nums) {
		int solution = solution(nums);
		System.out.println("solution = " + solution);
	}

	public static int solution(int[] nums) {
		int N = nums.length / 2;
		Set<Integer> set = new HashSet<>();
		IntStream.range(0,nums.length)
			.forEach(i->set.add(nums[i]));

		return Math.min(set.size(), N);
	}


}
