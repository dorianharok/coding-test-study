import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N]; // 5
        int[] play = new int[N+1]; // 0 ~ 6
        int participant = stages.length;
        for(int i=0; i<stages.length; i++){
            play[stages[i]-1]++;
        }
        ArrayList<Double> list = new ArrayList<>();
        for(int i=0; i<play.length; i++){
            if(i == N) continue;
            list.add(participant == 0 ? 0.0 : (double)play[i] / participant);
            participant -= play[i];
        }
        ArrayList<Integer> indexList = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            indexList.add(i);
        }
        Collections.sort(indexList, new Comparator<Integer>() {
            @Override
            public int compare(Integer idx1, Integer idx2) {
                return list.get(idx2).compareTo(list.get(idx1));
            }
        });
        for(int i=0; i<list.size(); i++){
            answer[i] = indexList.get(i)+1;
        }

        return answer;
    }
}