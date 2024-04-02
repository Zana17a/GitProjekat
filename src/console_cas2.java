import java.io.Console;
public class console_cas2 {
    public static void main(String[] args) {
        Console c1 = System.console();
        if (c1 != null) {
            c1.writer().println("Console exist");
        }
        Console c2= System.console();
        String line = c2.readLine();
        c2.writer().println("Hello " + line);
    }
}
