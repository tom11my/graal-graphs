
public class IfElse {
    public static void main(String[] args) {
        // while (true) {
        int result = ifElse(3);
        System.out.println(result);
        // }
    }

    public static int ifElse(int num) {
        int count = 0;
        if (num % 2 == 1) {
            count++;
            return count;
        } else {
            int z = 1;
            int f = 2;
            int h = 3;
            return z + f * h;
        }
    }
}
