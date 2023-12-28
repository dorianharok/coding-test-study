class Solution {
    public int solution(int[][] sizes) {
        // 가로 길이, 세로 길이 중 큰 수가 가로 길이에 오게 정렬
        for (int[] size : sizes) {
            // size = new int[]{Math.max(size[0], size[1]), Math.min(size[0], size[1])};
            // 위 방법은 메모리를 추가로 사용함!
            int maxValue = Math.max(size[0],size[1]);
            int minValue = Math.min(size[0],size[1]);
            size[0] = maxValue;
            size[1] = minValue;
        }

        int maxW = 0;
        int maxH = 0;

        for (int i = 0; i < sizes.length; i++) {
            maxW = Math.max(sizes[i][0], maxW);
        }
        for (int i = 0; i < sizes.length; i++) {
            maxH = Math.max(sizes[i][1], maxH);
        }

        return maxW * maxH;
    }
}


// Solution 2
class Solution {
    public int solution(int[][] sizes) {
        int w = 0, h = 0;
        for (int[] card : sizes) {
            w = Math.max(w, Math.max(card[0], card[1]));
            h = Math.max(h, Math.min(card[0], card[1]));
        }
        return w * h;
    }
}