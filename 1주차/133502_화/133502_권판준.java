public class No_133502 {
    public int solution(int[] ingredient) { // 실행 시간 초과
        int answer = 0;
        String bugger = "1231";

        StringBuilder sb = new StringBuilder();
        for (int i : ingredient) {
            sb.append(i);
        }
        String str = sb.toString();

        while(str.contains(bugger)) {
            str = str.replaceFirst(bugger, "");
            answer++;
        }

        return answer;
    }
}

// https://programmer-may.tistory.com/154