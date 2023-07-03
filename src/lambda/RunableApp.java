package lambda;

public class RunableApp {

    public static void main(String[] args) {
        Runnable runner = () -> System.out.println("Hello!");
        runner.run();

        hello(()-> showMessage("Hello!"));
    }

    public static void showMessage(String message) {
        System.out.println(message);
    }

    public static void hello(Runnable r) {
        r.run();
    }

}
