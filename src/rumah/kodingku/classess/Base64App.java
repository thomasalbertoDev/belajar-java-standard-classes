package rumah.kodingku.classess;

import java.util.Base64;

public class Base64App {

    public static void main(String[] args) {
        // Base64 Class merupakan class yang digunakan untuk mengkonversi string ke bentuk base64
        String name = "Rumah Kodingku";

        String encoded = Base64.getEncoder().encodeToString(name.getBytes());
        String decoded = new String(Base64.getDecoder().decode(encoded));

        System.out.println(encoded);
        System.out.println(decoded);
    }
}
