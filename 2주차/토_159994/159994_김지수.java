// Solution 1
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;
        for (String g : goal) {
            if (idx1 < cards1.length && cards1[idx1].equals(g))
                idx1++;
            else if (idx2 < cards2.length && cards2[idx2].equals(g))
                idx2++;
            else return "No";
        }
        return "Yes";
    }
}


// Solution 2
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int answer = 0;

        // cards1과 cards2를 공백을 포함하여 하나의 문자열로 합침
        String card1 = String.join(" ", cards1);
        String card2 = String.join(" ", cards2);

        for (int i = 0; i < goal.length; i++) {
            // 현재 goal[i]와 cards1의 첫 번째 카드가 일치하면
            if (goal[i].equals(card1.split(" ")[0])) {
                // card1에서 해당 카드를 하나 제거하고 앞뒤 공백을 제거한 결과를 다시 card1에 저장
                card1 = card1.replaceFirst(goal[i], "").trim();
                continue;
            }
            else if (goal[i].equals(card2.split(" ")[0])) {
                card2 = card2.replaceFirst(goal[i], "").trim();
                continue;
            }
            // goal[i]가 cards1이나 cards2에 없는 경우
            else {
                answer = 1;
                break;
            }
        }

        return answer == 0 ? "Yes" : "No";
    }
}