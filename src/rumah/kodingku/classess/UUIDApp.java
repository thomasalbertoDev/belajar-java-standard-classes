package rumah.kodingku.classess;

public class UUIDApp {

    public static void main(String[] args) {
        // UUID class merupakan class yang digunakan untuk membuat UUID secara otomatis
        for (int i = 0; i < 10; i++) {
            System.out.println(java.util.UUID.randomUUID());
        }
    }
}
