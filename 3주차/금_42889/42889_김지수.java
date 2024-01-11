// Solution 1
import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {

        double[] failureRate = new double[N+1];

        int[] playersAtStage = new int[N+2];
        for (int stage : stages) {
            playersAtStage[stage]++;
        }

        int totalPlayers = stages.length;
        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                failureRate[i] = 0;
            } else {
                failureRate[i] = (double) playersAtStage[i] / totalPlayers;
                totalPlayers -= playersAtStage[i];
            }
        }

        List<Integer> answerList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            answerList.add(i);
        }

        Collections.sort(answerList, (a, b) -> Double.compare(failureRate[b], failureRate[a]));

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;

    }
}


// Solution 2
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public int[] solution(int N, int[] lastStages) {
        int nPlayers = lastStages.length;
        int[] nStagePlayers = new int[N + 2];
        for (int stage : lastStages) {
            nStagePlayers[stage] += 1;
        }

        int remainingPlayers = nPlayers;
        List<Stage> stages = new ArrayList<>();
        for (int id = 1 ; id <= N; id++) {
            double failure = (double) nStagePlayers[id] / remainingPlayers;
            remainingPlayers -= nStagePlayers[id];

            Stage s = new Stage(id, failure);
            stages.add(s);
        }
        Collections.sort(stages, Collections.reverseOrder());

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stages.get(i).id;
        }
        return answer;
    }

    class Stage implements Comparable<Stage> {
        public int id;
        public double failure;

        public Stage(int id_, double failure_) {
            id = id_;
            failure = failure_;
        }

        @Override
        public int compareTo(Stage o) {
            if (failure < o.failure ) {
                return -1;
            }
            if (failure > o.failure ) {
                return 1;
            }
            return 0;
        }
    }
}


// Solution 3
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] tempArr = new double[N];
        int arrLength = stages.length;
        int idx = arrLength;
        double tempD = 0;
        int tempI = 0;

        for (int i = 0; i < arrLength; i++) {
            int stage = stages[i];
            if (stage != N + 1)
                answer[stage - 1] += 1;
        }
        for (int i = 0; i < N; i++) {
            int personNum = answer[i];
            tempArr[i] = (double) personNum / idx;
            idx -= personNum;
            answer[i] = i + 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N - i; j++) {
                if (tempArr[j - 1] < tempArr[j]) {
                    tempD = tempArr[j - 1];
                    tempArr[j - 1] = tempArr[j];
                    tempArr[j] = tempD;

                    tempI = answer[j - 1];
                    answer[j - 1] = answer[j];
                    answer[j] = tempI;
                }
            }
        }
        return answer;
    }
}