package rumah.kodingku.classess;

import java.math.BigInteger;

public class BigNumberApp {

    public static void main(String[] args) {
        // Big Number class pada java merupakan class yang dapat menampung banyak nilai melebihi Long

        BigInteger a = new BigInteger("10000000000");
        BigInteger b = new BigInteger("20000000000");

        BigInteger sum = a.add(b);

        System.out.println(sum);
    }
}
