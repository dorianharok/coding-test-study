public class No_12915 {
    public String[] solution(String[] strings, int n) {
        List<Str> list = new ArrayList<>();
        for (String str : strings) {
            list.add(new Str(str, str.charAt(n)));
        }
        Collections.sort(list);

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).s;
        }

        return answer;
    }

    class Str implements Comparable<Str> {
        String s;
        char ch;

        public Str(String s, char ch) {
            this.s = s;
            this.ch = ch;
        }

        @Override
        public int compareTo(Str o) {
            if (ch < o.ch) {
                return -1;
            } else if (ch > o.ch) {
                return 1;
            } else {
                return s.compareTo(o.s);
            }
        }
    }
}