public class No_42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();

        int deploy = (int) Math.ceil((double) (100 - progresses[0]) / speeds[0]);
        int cnt = 1;
        for (int i = 1; i < progresses.length; i++) {
            int day = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            if (deploy < day) {
                answer.add(cnt);
                deploy = day;
                cnt = 1;

            } else {
                cnt++;
            }
            if (i == progresses.length - 1) {
                answer.add(cnt);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}