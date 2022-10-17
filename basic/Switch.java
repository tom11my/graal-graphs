class Switch {
    public static void main(String[] args) {
        while (true) {
            exampleSwitch("foo", 10, 20, 30);
        }
    }
    private static int exampleSwitch(String f, int y, int x, int z) {
        final int a;
        switch (f) {
            case "foo":
                a = x;
                break;
            case "bar":
                a = y;
                break;
            default:
                a = z;
                break;
        }
        return a;
    }
}
