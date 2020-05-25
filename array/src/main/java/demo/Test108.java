package demo;

import java.util.Scanner;

/**
 * •计算一个数字的立方根，不使用库函数
 *
 * 详细描述：
 *
 * •接口说明
 *
 * 原型：
 *
 * public static double getCubeRoot(double input)
 *
 * 输入:double 待求解参数
 *
 * 返回值:double  输入参数的立方根，保留一位小数
 */
public class Test108 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = getCubeRoot(sc.nextDouble());
        System.out.printf("%.1f\n",result);
    }


    public static double getCubeRoot(double input){
        double max = input;
        double min = 0;
        double middle = 0;
        while ((max - min) > 0.001) {
            middle = (max + min) / 2;
            if (middle * middle * middle - input > 0) {
                max = middle;
            } else if (middle * middle * middle - input < 0) {
                min = middle;
            } else {
                return middle;
            }
        }
        return max;
    }
}
