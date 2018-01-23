package imperative.style.functional.programming;

import java.util.*;

public class UseMap {
    public static void main(String[] args) {
        Map<String, Integer> pageVisits = new HashMap<>();

        String page = "https://agiledeveloper.com";

        incrementPageVisit(pageVisits, page);
        incrementPageVisit(pageVisits, page);

        System.out.println(pageVisits.get(page));
    }

    public static void incrementPageVisit(Map<String, Integer> pageVisits, String page) {
        if(!pageVisits.containsKey(page)) {
            pageVisits.put(page, 0);
        }

        pageVisits.put(page, pageVisits.get(page) + 1);
    }
}