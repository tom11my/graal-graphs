import org.graalvm.polyglot.*;
import org.graalvm.polyglot.proxy.*;

public class HelloPolyglot {

    static String JS_CODE = "(function myFun(param){console.log('hello '+param);})";

    public static void main(String[] args) {
        while (true) {
            for (String arg : args) {
                interop(Integer.parseInt(args[0]));
            }
        }
    }

    public static void interop(int x) {
        System.out.println("Hello Java!");
        try (Context context = Context.create()) {
            Value value = context.eval("js", JS_CODE);
            value.execute(x);
        }
    }
}
