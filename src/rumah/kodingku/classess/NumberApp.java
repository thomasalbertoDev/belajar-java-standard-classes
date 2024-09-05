package rumah.kodingku.classess;

public class NumberApp {

    public static void main(String[] args) {

        // Number class memiliki banyak method yang dapat digunakan untuk melakukan konversi ke tipe data lainnya
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        System.out.println(longValue);
        System.out.println(doubleValue);

        // Konversi String ke number
        String value = "1000";
        Integer number = Integer.valueOf(value);
        Long number2 = Long.valueOf(value);
        System.out.println(number);
        System.out.println(number2);
    }
}
