package Sort;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static int[] getAfterSortData(int array[]) {
        if (array == null || array.length == 0) {
            throw new NullPointerException("排序数组为空");
        }
        //第i趟进行比较
        for (int i = 0; i < array.length; i++) {
            //开始比较,如果array[j] 比 array[j+1]大的话就交换位置
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tem = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tem;
                }
            }
        }
        return array;
    }

}
