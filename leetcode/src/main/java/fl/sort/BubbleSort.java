package fl.sort;


import java.util.Arrays;

/**
 * TODO
 *
 * @author fl
 * {@code @date} 2022年07月24日 01:00
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};

        bubbleSort(ints);
        System.out.println(Arrays.toString(ints));
    }

    public static void bubbleSort(int[] a) {
        if (a.length <= 1) {
            return;
        }

        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }

    }
}
    