import java.util.*;

public class HashMap {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("ABC by Jackson 5", "ABC, is easy as 123");
        trackList.put("Miami 2 Ibiza by Swedish House Mafia & Tinie Tempah", "Boy I must be FIFA and that's standard
        Procedure from Miami to Ibiza");
        trackList.put("Twisted by ATB", "Isn't that twisted, my love");
        trackList.put("Only You by Kaskade by Kaskade", "I will always know, only you");

        String title = 
        // get the keys by using the keySet method
        Set<String> keys = songMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(songMap.get(key));    
        }
    }
}