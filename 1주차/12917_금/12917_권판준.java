public class No_12917 {
    public String solution(String s) {
        String answer = "";

        char[] sArr = s.toCharArray();
        List<Character> sList = new ArrayList<>();
        for (char c : sArr) {
            sList.add(c);
        }
        Collections.sort(sList, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (Character c : sList) {
            sb.append(c);
        }

        answer = sb.toString();
        return answer;
    }
}