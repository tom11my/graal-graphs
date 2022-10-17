import java.util.List;
import java.util.Arrays;

public class CountOdds {
    public static void main(String[] args) {
        List l = Arrays.asList(1, 2, 3);
        while (true) {
            for (String arg : args) {
                countOdds(l);
            }
        }
    }

    public static int countOdds(List<Integer> data) {
        int count = 0;
        for (int i = 0; i < data.size(); i++) {
            if (i % 2 == 1) {
                count++;
            }
        }
        return count;
    }
}
