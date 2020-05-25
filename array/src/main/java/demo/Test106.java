package demo;

import java.util.Scanner;

public class Test106 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(getMinMult(a,b));

    }


    private static  int getMinMult(int a ,int b ){
        int result = a*b;
        return result/gcd(a,b);
    }

    public static int gcd(int a,int b){
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
