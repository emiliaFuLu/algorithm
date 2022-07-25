package fl.sort;

/**
 * TODO
 *
 * @author fl
 * @date 2022年07月25日 21:20
 */
public class MergeSort {

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 3, 5, 7, 9};
        Integer[] b = new Integer[]{2, 4, 6, 8};
        Integer[] merge = merge(a, b);
        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i]);
        }
    }

    public static Integer[] merge(Integer[] a, Integer[] b) {
        if (a.length == 0) {
            return b;
        }

        if (b.length == 0) {
            return a;
        }

        Integer[] tmpA = new Integer[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            tmpA[i] = a[i];
        }
        tmpA[a.length] = Integer.MAX_VALUE;

        Integer[] tmpB = new Integer[b.length + 1];
        for (int i = 0; i < b.length; i++) {
            tmpB[i] = b[i];
        }
        tmpB[b.length] = Integer.MAX_VALUE;

        Integer[] fina = new Integer[a.length + b.length];
        for (int k = 0, i = 0, j = 0; k < fina.length; k++) {
            if (tmpA[i] > tmpB[j]) {
                fina[k] = tmpB[j++];
            } else {
                fina[k] = tmpA[i++];
            }
        }


        return fina;
    }
}
    