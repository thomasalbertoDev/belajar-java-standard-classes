package rumah.kodingku.classess;

public class StringBuilderApp {
    // String builder pada java merupakan objek yang dapat digunakan untuk membuat string yang dimana data nya bisa ditambahkan dan diubah setiap saat

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("Thomas");
        builder.append(" ");
        builder.append("Alberto");
        builder.append(" ");
        System.out.println(builder);
    }
}
