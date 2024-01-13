import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<DataRecord> filteredData = filterData(data, ext, val_ext);
        Collections.sort(filteredData, (a, b) -> compareData(a, b, sort_by));

        int[][] answer = new int[filteredData.size()][];
        for (int i = 0; i < filteredData.size(); i++) {
            answer[i] = filteredData.get(i).getData();
        }

        return answer;
    }

    private List<DataRecord> filterData(int[][] data, String ext, int val_ext) {
        List<DataRecord> filteredData = new ArrayList<>();
        for (int[] record : data) {
            if (matchesCondition(record, ext, val_ext)) {
                filteredData.add(new DataRecord(record));
            }
        }
        return filteredData;
    }

    private boolean matchesCondition(int[] record, String ext, int val_ext) {
        switch (ext) {
            case "code":
                return record[0] < val_ext;
            case "date":
                return record[1] < val_ext;
            case "maximum":
                return record[2] < val_ext;
            case "remain":
                return record[3] < val_ext;
            default:
                return false;
        }
    }

    private int compareData(DataRecord a, DataRecord b, String sort_by) {
        switch (sort_by) {
            case "code":
                return Integer.compare(a.getCode(), b.getCode());
            case "date":
                return Integer.compare(a.getDate(), b.getDate());
            case "maximum":
                return Integer.compare(a.getMaximum(), b.getMaximum());
            case "remain":
                return Integer.compare(a.getRemain(), b.getRemain());
            default:
                return 0;
        }
    }

    private static class DataRecord {
        private final int code;
        private final int date;
        private final int maximum;
        private final int remain;

        public DataRecord(int[] data) {
            this.code = data[0];
            this.date = data[1];
            this.maximum = data[2];
            this.remain = data[3];
        }

        public int getCode() {
            return code;
        }

        public int getDate() {
            return date;
        }

        public int getMaximum() {
            return maximum;
        }

        public int getRemain() {
            return remain;
        }

        public int[] getData() {
            return new int[]{code, date, maximum, remain};
        }
    }
}
