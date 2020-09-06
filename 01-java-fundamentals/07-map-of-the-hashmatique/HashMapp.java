import java.util.HashMap;

public class HashMapp {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("ABC", "ABC, is easy as 123");
        trackList.put("Miami 2 Ibiza", "Boy I must be FIFA and that's standard procedure from Miami to Ibiza");
        trackList.put("Twisted", "Isn't that twisted, my love");
        trackList.put("Only You", "I will always know, only you");

        for (String key : trackList.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, trackList.get(key)));
        }
    }
}