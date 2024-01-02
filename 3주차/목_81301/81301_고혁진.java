class Solution {
    public int solution(String s) {
        String[] arr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] arr2 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < 10; i++) {
            s = s.replace(arr2[i], arr[i]);
        }
        return Integer.parseInt(s);
    }
}