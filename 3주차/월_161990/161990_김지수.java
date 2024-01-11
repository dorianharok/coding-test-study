// Solution 1
import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        List<Integer>[] coordinates = new ArrayList[2];
        coordinates[0] = new ArrayList<>();
        coordinates[1] = new ArrayList<>();

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                char c = wallpaper[i].charAt(j);
                if (c == '#') {
                    coordinates[0].add(i);
                    coordinates[1].add(j);
                    min = Math.min(min, j);
                    max = Math.max(max, j);
                }
            }
        }
        int lux = coordinates[0].get(0);
        int rdx = coordinates[0].get(coordinates[0].size() - 1) + 1;
        int[] answer = {lux, min, rdx, max + 1};
        return answer;
    }
}


// Solution 2
class Solution {
    public int[] solution(String[] wallpaper) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        for(int i=0; i< wallpaper.length;i++ ){
            for(int j=0; j<wallpaper[i].length();j++){
                if(wallpaper[i].charAt(j)=='#'){
                    minX = Math.min(minX,i);
                    minY = Math.min(minY,j);
                    maxX = Math.max(maxX,i);
                    maxY = Math.max(maxY,j);
                }
            }
        }
        return new int[]{minX,minY,maxX+1,maxY+1};
    }
}