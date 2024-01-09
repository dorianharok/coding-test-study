import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<String> list = List.of("code", "date", "maximum", "remain");

        int extIndex = list.indexOf(ext);
        int sortIndex = list.indexOf(sort_by);

        return Arrays.stream(data)
                .filter(d -> d[extIndex] < val_ext)
                .sorted(Comparator.comparingInt(o -> o[sortIndex]))
                .toArray(int[][]::new);
    }
}