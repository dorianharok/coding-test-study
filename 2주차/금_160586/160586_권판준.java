public class No_160586 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Map<String, Integer> keys = new HashMap<>();
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                keys.put(String.valueOf(keymap[i].charAt(j)), 0);
            }
        }

        for (String s : keys.keySet()) {
            int index = 100;
            for (int i = 0; i < keymap.length; i++) {
                if (keymap[i].indexOf(s) != -1 && index > keymap[i].indexOf(s)) {
                    index = keymap[i].indexOf(s);
                }
            }
            keys.put(s, index + 1);
        }

        for (int i = 0; i < targets.length; i++) {
            int num = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                Integer n = keys.get(String.valueOf(targets[i].charAt(j)));
                if (n == null) {
                    num = -1;
                    break;
                } else {
                    num += n;
                }
            }
            answer[i] = num;
        }

        return answer;
    }
}