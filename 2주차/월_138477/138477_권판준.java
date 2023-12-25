public class No_138477 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        List<Integer> top3 = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            top3.add(score[i]);
            Collections.sort(top3);
            if (top3.size() > k) {
                top3.remove(0);
            }
            answer[i] = top3.get(0);
        }

        return answer;
    }
}