public class NestedLoop {
    public static void main(String[] args) {
        while (true) {
            for (String arg : args) {
                int ans = countNested(5, 5);
            }
        }
    }

    private static int countNested(int bound1, int bound2) {
        int count = 0;
        for (int i = 0; i < bound1; i++) {
            for (int j = 0; j < bound2; j++) {
                count += 1;
            }
        }
        return count;
    }

}
