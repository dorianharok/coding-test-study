import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int left = wallpaper[0].length();
        int right = 0;
        int up = wallpaper.length;
        int down = 0;
        for (int i = 0 ; i < up; i++ ) {
            for (int j = 0 ; j < left;  j++ ) {

                char space = wallpaper[i].charAt(j);
                if (space == '#') {
                    if (j < left)
                        left = j;
                    if (right < j)
                        right = j;
                    if(i < up)
                        up = i;
                    if(down < i)
                        down = i;
                }
            }
        }

        int[] answer = {up, left, down+1, right+1};

        return answer;
    }
}