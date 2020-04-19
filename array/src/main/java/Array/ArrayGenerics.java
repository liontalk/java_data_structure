package Array;

/**
 * 增加java 泛型的数组
 */
public class ArrayGenerics<E> {


    /**
     * 声明的数组
     */
    private E[] data;

    /**
     * 数组中的元素个数
     */
    private int size;


    public ArrayGenerics(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public ArrayGenerics() {
        //默认的数组长度是10
        this(10);
        size = 0;
    }

    /**
     * 在最后一个位置添加元素
     *
     * @param e 要添加的元素
     */
    public void addLast(E e) {
        add(size, e);
    }


    /**
     * 在起始的位置增加元素
     *
     * @param e
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * 在某个固定的位置添加元素
     *
     * @param index 数组的index
     * @param e     添加的元素
     */
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Add Fail,Required index >= 0 and index <=size");
        }
        if (size == data.length) {
            resize(2 * data.length);
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     * 获取元素
     *
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("数组越界异常！");
        }
        return data[index];
    }


    /**
     * 设置元素
     *
     * @param index
     * @param e
     */
    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("数组越界异常！");
        }
        data[index] = e;
    }


    /**
     * 数组中是否包含某一个元素
     *
     * @param e 要包含的元素
     * @return 是否包含的结果
     */
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }


    /**
     * 如果没有查找到某一个元素的时候返回 -1,表示是非法的索引
     *
     * @param e 查找的元素
     * @return
     */
    public int find(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }


    /**
     * 删除第一个元素
     *
     * @return
     */
    public E removeFirst() {
        return remove(0);
    }


    /**
     * 删除最后一个元素
     *
     * @return
     */
    public E removeLast() {
        return remove(size - 1);
    }


    /**
     * 删除固定元素
     *
     * @param e
     */
    public void removeElement(int e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    /**
     * 返回要删除的元素
     *
     * @param index 删除元素的位置
     * @return
     */
    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("数组越界异常！");
        }
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        if(size==data.length/2){
            resize(data.length/2);
        }
        return data[index];
    }


    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.format("Array:size= %d,capacity=%d\n", size, data.length));
        stringBuffer.append("[");
        for (int i = 0; i < size; i++) {
            stringBuffer.append(data[i]);
            if (i != (size - 1)) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }


    /**
     * 数组扩容
     *
     * @param newCapacity
     */
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}
