package demo;

import java.util.Scanner;

public class Test99 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        String result = sc.nextLine();
        for (int i = result.length() - 1; i >= 0; i--) {
            sb.append(result.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
