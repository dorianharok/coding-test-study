public class No_42576 {
    public String solution(String[] participant, String[] completion) { // 시간 초과
        ArrayList<String> participantList = new ArrayList<>(Arrays.asList(participant));
        ArrayList<String> completionList = new ArrayList<>(Arrays.asList(completion));
        for (String c : completionList) {
            participantList.remove(c);
        }

        return participantList.get(0);
    }

    public String solution2(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[participant.length - 1];
    }
}