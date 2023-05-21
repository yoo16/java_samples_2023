package sns.entity;

public class App {
    public static void main(String[] args) {
        User user = new User();
        user.name = "東京 太郎";
        user.email = "test@example.com";
        user.password = "pass12345";


        // user.setName("東京　太郎");
        // user.setEmail("test@example.com");
        // user.setPassword("pass12345");
    }
}
