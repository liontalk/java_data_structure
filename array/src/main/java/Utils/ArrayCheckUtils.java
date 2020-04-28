package Utils;

public class ArrayCheckUtils {


    public static boolean checkArrayIsNull(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        } else {
            return true;
        }
    }
}
