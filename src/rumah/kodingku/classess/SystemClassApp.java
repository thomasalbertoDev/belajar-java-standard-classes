package rumah.kodingku.classess;

public class SystemClassApp {

    public static void main(String[] args) {

        // System Class merupakan class yang digunakan untuk mengetahui informasi tentang sistem komputer kita
        System.out.println(System.currentTimeMillis());
        System.out.println(System.getProperty("user.dir"));

        System.out.println(System.lineSeparator());

        System.out.println(System.getenv("JAVA_HOME"));
    }
}
