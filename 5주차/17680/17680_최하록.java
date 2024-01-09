import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 5 * cities.length;
        if(cacheSize == 0) return answer;

        Queue<String> q = new ArrayDeque<>();
        for(String city : cities) {
            city = city.toLowerCase();

            if(q.contains(city)) {
                q.remove(city);
                answer -= 4;
            }

            if(q.size() == cacheSize) {
                q.poll();
            }

            q.offer(city);
        }

        return answer;
    }
}