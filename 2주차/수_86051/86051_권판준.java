public class No_86051 {
    public int solution(int[] numbers) {
        String nums = "0123456789";

        for (int i = 0; i < numbers.length; i++) {
            nums = nums.replace(String.valueOf(numbers[i]), "");
        }

        int answer = 0;
        for (int i = 0; i < nums.length(); i++) {
            answer += Integer.valueOf(Character.toString(nums.charAt(i)));
        }

        return answer;
    }
}