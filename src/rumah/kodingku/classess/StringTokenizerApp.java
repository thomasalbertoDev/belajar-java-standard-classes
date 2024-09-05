package rumah.kodingku.classess;

import java.util.StringTokenizer;

public class StringTokenizerApp {

    public static void main(String[] args) {
        // String Tokenizer pada java digunakan untuk memotong String menjadi token atau string yang lebih kecil

        String value = "Thomas Alberto";
        StringTokenizer tokenizer = new StringTokenizer(value, " ");

        while (tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);

        }
    }
}
