package rumah.kodingku.classess;

public class RuntimeApp {

    public static void main(String[] args) {
        // Runtime Class merupakan class yang digunakan untuk mengetahui informasi tentang runtime pada komputer kita
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.maxMemory());
    }
}
