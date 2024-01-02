public class No_42889 {
    public int[] solution(int N, int[] stages) {
        double[] failRate = new double[N];

        Arrays.sort(stages);
        for (int i = 0; i < failRate.length; i++) {
            int total = 0;
            int fail = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i + 1) {
                    fail++;
                }
                if (stages[j] >= i + 1) {
                    total++;
                }
            }
            if(total == 0) {
                failRate[i] = 0;
            } else {
                failRate[i] = (double) fail / total;
            }
        }

        for (double v : failRate) {
            System.out.println("v = " + v);
        }

        int[] answer = new int[N];

        ArrayList<Double> list = new ArrayList<>(Arrays.stream(failRate).boxed().collect(Collectors.toList()));
        for (int i = 0; i < list.size(); i++) {
            Double max = list.stream().max(Double::compare).orElse(null);
            int index = list.indexOf(max);
            answer[i] = index + 1;
            list.set(index, -1.0);
        }

        return answer;
    }
}