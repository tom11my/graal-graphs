public class NestedCall {
    public static void main(String[] args) {
        while (true) {
            for (String arg : args) {
                nestedCall(Integer.parseInt(args[0]));
            }
        }
    }

    private static int f(int n) {
        int y = -1;
        return y * n;
    }

    private static int nestedCall(int n) {
        int x = 12;
        return f(n) + x;
    }
}
