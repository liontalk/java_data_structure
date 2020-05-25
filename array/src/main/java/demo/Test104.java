package demo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 最小公约数
 */
public class Test104 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = String.valueOf(scanner.nextLong());
        String b = String.valueOf(scanner.nextLong());
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);
        BigInteger result = a1.gcd(b1);
        System.out.println(result);
    }
}
