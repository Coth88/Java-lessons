import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
         String data = "src/main/resources/map.json";
        Path path = Path.of(data).toAbsolutePath();
        System.out.println(path);

        System.out.println(data);
    }
}