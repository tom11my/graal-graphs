public class ObjExample {
    public static class Point {
        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        while (true) {
            for (String arg : args) {
                Point p = new Point(-1, 2);
                Point rs = objMutate(p);
            }
        }
    }

    private static Point objMutate(Point x) {
        x.y = -1;
        return x;
    }

}
