public class No_42885 {
    public static void main(String[] args) {
        int[] ints = {70, 50, 80, 50};
        int[] ints2 = {70, 50, 80};
        System.out.println(new No_42885().solution(ints, 100));
    }

    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        int j = 0;
        for (int i = people.length - 1; i >= 0; i--) {
            if (i < j) {
                break;
            }

            if (people[i] + people[j] <= limit) {
                j++;
            }
            answer++;
        }
        return answer;
    }
}