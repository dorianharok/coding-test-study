public class No_12935 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        list.remove(list.stream()
                .min(Integer::compareTo)
                .orElseThrow());

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}