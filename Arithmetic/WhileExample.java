public class WhileExample {
    public static void main(String[] args) {
        while (true) {
            for (String arg : args) {
                whileExample(Integer.parseInt(args[0]));
            }
        }
    }

    private static int whileExample(int x) {
        int y = 0;
        while (y < x) {
            y = y + 1;
        }
        return y;
    }
}
