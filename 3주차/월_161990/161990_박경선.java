class Solution {
    public int[] solution(String[] wallpaper) {
        // 굳이 바꾸지 않아도 될듯?
        int[][] arr = new int[wallpaper.length][wallpaper[0].length()];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(wallpaper[i].charAt(j) == '#'){
                    arr[i][j] = 1;
                }
            }
        }

        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == 1){
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i+1);
                    maxY = Math.max(maxY, j+1);
                }
            }
        }
     return new int[]{minX, minY, maxX, maxY};
    }
}
