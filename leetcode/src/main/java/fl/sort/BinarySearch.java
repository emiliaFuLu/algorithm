package fl.sort;


/**
 * BinarySearch
 *
 * @author fulu
 * {@code @date} 2022/7/27 14:03
 * {@code @description} 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = new int[]{1, 3, 5, 7, 9};
//        int i = binarySearch(arr, 3);
//        System.out.println(i);

        int[] arr = new int[]{1, 3, 5, 7, 9};
        int binary = binary(arr, 0, arr.length - 1, 9);
        System.out.println(binary);
    }

    // 正常的二分法
    public static int binarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


    //递归的二分
    public static int binary(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1;
        }

        int mid = low + ((high - low) >> 1);
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binary(arr, low, mid - 1, target);
        } else {
            return binary(arr, mid + 1, high, target);
        }
    }

}
