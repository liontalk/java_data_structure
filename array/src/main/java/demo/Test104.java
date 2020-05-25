package demo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 最小公约数
 */
public class Test104 {

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        String a = String.valueOf(scanner.nextLong());
//        String b = String.valueOf(scanner.nextLong());
//        BigInteger a1 = new BigInteger(a);
//        BigInteger b1 = new BigInteger(b);
//        BigInteger result = a1.gcd(b1);
//        System.out.println(result);
//    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a * b / gcd(a, b);
        System.out.println(result);
    }


    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }


}
