package Array;

public class ArrayMain {

    public static void main(String[] args) {
        Array array = new Array(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array.toString());

        array.add(3,1000);
        System.out.println(array.toString());










        array.remove(3);
        System.out.println(array.toString());


        array.removeElement(9);
        System.out.println(array.toString());
    }
}
