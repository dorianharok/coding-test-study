public class No_42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < answer.length; i++) {
            int from = commands[i][0];
            int to = commands[i][1];
            int idx = commands[i][2];

            int[] subArr = new int[to - from + 1];
            for (int j = from - 1; j < to; j++) {
                subArr[j - (from - 1)] = array[j];
            }
            Arrays.sort(subArr);
            answer[i] = subArr[idx -1];
        }

        return answer;
    }
}