// Solution 1
import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        // Cache Hit: CPU가 참조하고자 하는 메모리가 캐시에 존재할 때
        // Cache Miss: CPU가 참조하고자 하는 메모리가 캐시에 존재하지 않을 때

        if (cacheSize == 0) {
            return 5 * cities.length;
        }

        int runtime = 0;
        Queue<String> cache = new LinkedList<String>();

        for (String city : cities) {
            city = city.toUpperCase();

            if (cache.remove(city)) {
                runtime += 1;
                cache.add(city);
            } else {
                runtime += 5;
                if (cache.size() >= cacheSize) {
                    cache.poll();
                }
                cache.add(city);
            }
        }
        return runtime;
    }
}


// Solution 2
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


// Solution 3
import java.util.ArrayList;

class Solution {
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<String>();

        if (cacheSize == 0)
            return cities.length * 5;

        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toUpperCase();

            if (list.contains(cities[i])) {
                answer++;
                list.remove(cities[i]);
                list.add(cities[i]);
            } else {
                answer += 5;
                if (list.size() == cacheSize) {
                    list.remove(0);
                    list.add(cities[i]);
                }
                else
                    list.add(cities[i]);
            }
        }
        return answer;
    }
}