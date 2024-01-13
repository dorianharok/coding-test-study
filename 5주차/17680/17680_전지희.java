import java.util.LinkedHashSet;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        LinkedHashSet<String> cache = new LinkedHashSet<>(cacheSize);

        for (String city : cities) {
            city = city.toLowerCase();
            
            if (cache.contains(city)) {
                cache.remove(city);
                cache.add(city);
                answer += 1;
            } else {
                cache.add(city);
                if (cache.size() > cacheSize) {
                    cache.remove(cache.iterator().next());
                }
                answer += 5;
            }
        }

        return answer;
    }
}
