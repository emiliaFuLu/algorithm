package fl.Array;

/**
 * array
 *
 * @author fulu
 * {@code @date} 2022/7/19 10:55
 * {@code @description} 数组的插入删除a
 */
public class Array {

    // 数组
    private final int[] array;
    // 数组长度
    private final int length;
    // 数组实际元素数量
    private int size;
    // 数组默认大小
    private final static int defaultCapacity = 10;

    public Array() {
        this(defaultCapacity);
    }

    public Array(int capacity) {
        this.array = new int[capacity];
        this.length = capacity;
        size = 0;
    }

    public boolean insert(int index, int value) {
        if (size == length) {
            System.out.println("数组满了");
            return false;
        }
        if (index < 0 || index > length) {
            System.out.println("角标越界");
            return false;
        }

        if (size - index >= 0)
            System.arraycopy(array, index, array, index + 1, size - index);

        array[index] = value;
        ++size;
        return true;
    }

    public boolean delete(int index, int value) {
        if (index < 0 || index > length) {
            System.out.println("角标越界");
            return false;
        }

        if (size - index >= 0)
            System.arraycopy(array, index + 1, array, index, size - index);

        --size;
        return true;
    }

    public int get(int index) {
        if (index < 0 || index > length || index > size) {
            System.out.println("角标越界");
            return -1;
        }

        return array[index];
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.printf(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array array = new Array(5);
        array.printAll();
        array.insert(0, 3);
        array.insert(0, 4);
        array.insert(1, 5);
        array.insert(3, 9);
        array.insert(3, 10);
        //array.insert(3, 11);
        array.printAll();
    }
}
 