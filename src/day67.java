import java.util.*;

public class day67 {
    static class Cache extends LinkedHashMap<Integer, String> {
        private final int capacity;

        Cache(int capacity) {
            super(capacity, 0.75f, true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
            return size() > capacity;
        }
    }

    public static void main(String[] args) {
        Cache cache = new Cache(3);
        cache.put(1, "DSA");
        cache.put(2, "Java");
        cache.put(3, "Python");
        System.out.println(cache);
        cache.get(1);
        cache.put(4, "C++");
        System.out.println(cache);

    }
}
