public class No_64065 {
    public int[] solution(String s) {
        int[] answer = {};

        s = s.substring(2, s.length() - 2);
        String[] splitS = s.split("},\\{");
        Arrays.sort(splitS, (str1, str2) -> Integer.compare(str1.length(), str2.length()));
        List<Integer> list = new ArrayList<>();
        for (String str : splitS) {
            String[] splitStr = str.split(",");
            for (String s1 : splitStr) {
                int i = Integer.parseInt(s1);
                if (!list.contains(i)) {
                    list.add(i);
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}