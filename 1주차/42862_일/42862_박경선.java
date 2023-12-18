class Solution {
    static int[] students;
    static int cnt = 0;
    public int solution(int n, int[] lost, int[] reserve) {
        students = new int[n];

        for(int i=0; i<n; i++){
            students[i]++;
        }

        for (int idx : reserve) {
            students[idx-1]++;
        }

        for (int idx : lost) {
            students[idx-1]--;
        }

        for(int i=0; i<n; i++){
            if(students[i] == 0){
                checkSuit(i, n);
            }
            if(students[i] >= 1) cnt++;
        }

        return cnt;
    }

    private static void checkSuit(int i, int n) {

        if(i == 0){
            if(students[i+1] > 1) {
                students[i+1]--;
                cnt++;
            }
        }
        else if(i == n-1){
            if(students[i-1] > 1){
                students[i-1]--;
                cnt++;
            }
        }
        else{
            if(students[i-1] > 1 ){
                students[i-1]--;
                cnt++;
            }
            else if(students[i+1] > 1){
                students[i+1]--;
                cnt++;
            }
        }
    }
}