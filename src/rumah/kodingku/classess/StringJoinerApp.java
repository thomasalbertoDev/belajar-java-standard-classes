package rumah.kodingku.classess;

import java.util.StringJoiner;

public class StringJoinerApp {

    public static void main(String[] args) {
        // String joiner pada java merupakan class yang digunakan untuk menggabungkan string dengan delimiter dan diawali dengan pefix serta diakhiri dengan suffix
         StringJoiner joiner = new StringJoiner(", ", "{", "}");

        joiner.add("Thomas");
        joiner.add("Alberto");
        joiner.add("Rumah Kodingku");
        System.out.println(joiner);
    }
}
