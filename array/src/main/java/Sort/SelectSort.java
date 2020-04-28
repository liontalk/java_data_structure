package Sort;

import Utils.ArrayCheckUtils;

/**
 * 选择排序
 */
public class SelectSort {

    public static int[] getSelectSortResult(int array[]) {
        boolean result = ArrayCheckUtils.checkArrayIsNull(array);
        if (result) {
            int max;
            //遍历最后一个元素就不在遍历了
            for (int i = 0; i < array.length - 1; i++) {
                max = i;
                //从第i+1个元素遍历之后
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] > array[max]) {
                        max = j;
                    }
                }
                int temp = array[i];
                array[i] = array[max];
                array[max] = temp;
            }
        }
        return array;
    }
}
