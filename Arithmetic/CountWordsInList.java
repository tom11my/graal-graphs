import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public class CountWordsInList {
    public static HashMap<String, Integer> wordCounter(List<String> words) {
        HashMap<String, Integer> count = new HashMap<String, Integer>();
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            Integer integer = count.get(word);
            if (integer == null)
                count.put(word, 1);

            else {
                count.put(word, integer + 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List l = Arrays.asList("dog", "cat", "mouse", "cat", "cat", "mouse");
        while (true) {
            for (String arg : args) {
                HashMap<String, Integer> h = wordCounter(l);
                assert h.get("cat") == 3 : "cat count is off";
                assert h.get("dog") == 1 : "cat count is off";
            }
        }
    }
}
