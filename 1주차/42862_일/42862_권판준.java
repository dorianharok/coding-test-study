public class No_42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n+1];

        for (int i = 0; i < lost.length; i++) {
            students[lost[i]]--;
        }
        for (int i = 0; i < reserve.length; i++) {
            students[reserve[i]]++;
        }

        int cnt = 0;
        for (int i = 1; i < students.length; i++) {
            if(students[i] < 0) {
                if(students[i-1] == 1) {
                    students[i-1]--;
                    students[i]++;
                } else if (i+1 < students.length && students[i+1] == 1) {
                    students[i+1]--;
                    students[i]++;
                }
            }
            if(students[i] >= 0) {
                cnt++;
            }
        }

        return cnt;
    }
}