class Solution {
    public boolean solution(int x) {
        String[] strX = String.valueOf(x).split("");
        int num = 0;
        for (String s : strX) {
            num += Integer.parseInt(s);
        }
        return x % num == 0;
    }
}