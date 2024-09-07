package rumah.kodingku.classess;

import java.util.Calendar;

public class DateApp {

    public static void main(String[] args) {
        // Date Calendar Class pada java merupakan class yang digunakan untuk mengetahui tanggal dan waktu
        Calendar calendar = Calendar.getInstance();
        calendar.set(1999, 0, 1); // Set Tahun, Bulan, Tanggal

        System.out.println(calendar.getTime());
    }
}
