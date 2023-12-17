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

    // https://programmer-may.tistory.com/154 풀이 참조
    public int solution(int[] ingredient) {
        int answer = 0;
        String bugger = "1231";

        StringBuilder sb = new StringBuilder();
        for (int i : ingredient) {
            sb.append(i);
            
            if(sb.length() > 3 && sb.substring(sb.length() - 4, sb.length()).equals(bugger)) {
                sb.delete(sb.length() - 4, sb.length());
                answer++;
            }
        }

        return answer;
    }
}
