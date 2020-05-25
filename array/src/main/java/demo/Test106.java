package demo;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 最小公倍数
 */
public class Test106 {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int sum = 0;
//        int count = 0;
//        int zc = 0;
//        for (int i = 0; i < a; i++) {
//            int b = scanner.nextInt();
//            if (b <= 0) {
//                count++;
//            }else{
//                zc ++;
//                sum = sum +b;
//            }
//        }
//        System.out.println(count);
//        if(zc == 0) {
//            zc = 1;
//        }
//        System.out.printf("%.1f",1.0*sum/zc);
//    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a =Integer.parseInt( scanner.nextLine());
//        int sum = 0;
//        int count = 0;
//        int zc = 0;
//        for (int i = 0; i < a; i++) {
//            int b = Integer.parseInt(scanner.nextLine());
//            if (b <= 0) {
//                count++;
//            }else{
//                zc ++;
//                sum = sum +b;
//            }
//        }
//        System.out.println(count);
//        if(zc == 0) {
//            zc = 1;
//        }
       // System.out.printf("%.1f",1.0*sum/zc);



            Scanner sc = new Scanner(System.in);
            int cntn = 0, cntp = 0;
            float sum = 0;
            while(sc.hasNext()){
                int num = sc.nextInt();
                if(num < 0) cntn++;
                else{
                    sum += num;
                    cntp++;
                }
            }
            DecimalFormat fnum = new DecimalFormat("##0.0");
            System.out.println(cntn);
            if(cntp == 0) System.out.println("0.0");
            else System.out.println(fnum.format(sum / cntp));
    }
}
