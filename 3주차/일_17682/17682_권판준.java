public class No_17682 {
    public int solution(String dartResult) {
        Queue<Character> queue = new LinkedList<>();
        Map<Integer, Integer> scores = new HashMap<>();
        int scoresIdx = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);

            if (Character.isDigit(ch) && i - 1 >= 0 && Character.isDigit(dartResult.charAt(i - 1))) {
                queue.add(ch);
                continue;
            }

            if (i == dartResult.length() - 1) {
                queue.add(ch);
            }

            if (Character.isDigit(ch) && !queue.isEmpty() || i == dartResult.length() - 1) {
                String[] round = new String[3];
                int roundIdx = 0;
                while (!queue.isEmpty()) {
                    Character rm = queue.remove();
                    if (queue.peek() != null && Character.isDigit(queue.peek())) {
                        String s = rm.toString() + queue.remove().toString();
                        round[roundIdx++] = s;
                        continue;
                    }
                    round[roundIdx++] = rm.toString();
                }

                int result = 0;
                switch (round[1]) {
                    case "S":
                        result = (int) Math.pow(Integer.parseInt(round[0]), 1);
                        break;
                    case "D":
                        result = (int) Math.pow(Integer.parseInt(round[0]), 2);
                        break;
                    case "T":
                        result = (int) Math.pow(Integer.parseInt(round[0]), 3);
                        break;
                    default:
                        break;
                }
                scores.put(scoresIdx, result);

                if (round[2] != null) {
                    switch (round[2]) {
                        case "*":
                            if (scoresIdx - 1 >= 0) {
                                scores.replace(scoresIdx - 1, scores.get(scoresIdx - 1) * 2);
                            }
                            scores.replace(scoresIdx, scores.get(scoresIdx) * 2);
                            break;
                        case "#":
                            scores.replace(scoresIdx, -scores.get(scoresIdx));
                            break;
                        default:
                            break;
                    }
                }

                scoresIdx++;
            }

            queue.add(ch);
        }

        int sum = 0;
        for (Integer score : scores.values()) {
            sum += score;
        }

        return sum;
    }
}