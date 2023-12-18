class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] ld = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int day_Sum = 0;
        for(int i=0;i<a-1;i++){
            day_Sum+=ld[i];
        }
        day_Sum+=(b-1);
        answer = day[day_Sum%7];
        return answer;
    }
}