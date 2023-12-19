public class No_76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for (int i = 0; i < absolutes.length; i++) {
            sum += signs[i] == true ? absolutes[i] : (absolutes[i] * -1);
        }

        return sum;
    }
}