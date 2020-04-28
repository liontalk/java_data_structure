package Sort;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{10, 1, 35, 61, 89, 36, 55};

        /**
         * 冒泡排序
         */
        BubbleSort sort = new BubbleSort();
        int[] newArray = sort.getAfterSortData(array);


        /**
         * 选择排序
         */
        SelectSort selectSort = new SelectSort();
        int[] selectNewArray = selectSort.getSelectSortResult(array);
        printResult(selectNewArray);
    }


    public static void printResult(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
