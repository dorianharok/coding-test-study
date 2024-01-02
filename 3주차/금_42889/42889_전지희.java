import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] failureRate = new double[N];

        int[] playersAtStage = new int[N + 2];
        for (int stage : stages) {
            playersAtStage[stage]++;
        }

        int totalPlayers = stages.length;
        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                failureRate[i - 1] = 0;
            } else {
                failureRate[i - 1] = (double) playersAtStage[i] / totalPlayers;
                totalPlayers -= playersAtStage[i];
            }
        }

        List<Integer> stageList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            stageList.add(i);
        }

        Collections.sort(stageList, (a, b) -> Double.compare(failureRate[b - 1], failureRate[a - 1]));

        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i);
        }

        return answer;
    }
}
