public class No_42840 {
    public int[] solution(int[] answers) {
        int[][] strategy = new int[][] {{1, 2, 3, 4, 5},
                                        {2, 1, 2, 3, 2, 4, 2, 5},
                                        {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        int[] cnt = new int[strategy.length];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < cnt.length; j++) {
                if (strategy[j][i % strategy[j].length] == answers[i]) {
                    cnt[j]++;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        int max = Arrays.stream(cnt).max().orElse(0);
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == max) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}