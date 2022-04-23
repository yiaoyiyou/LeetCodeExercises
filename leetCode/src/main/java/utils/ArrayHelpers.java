package utils;

/**
 * @Author weike
 * @Date 2022/4/23 16:07
 * @ClassName ArrayHelpers
 */
public class ArrayHelpers {
    public static  <T extends Number> void swapEle(T[] arr, int m, int n) {
        assert m >= 0 && m < arr.length;
        assert n >= 0 && n < arr.length;
        T swap = arr[m];
        arr[m] = arr[n];
        arr[n] = swap;
    }

    public static void swapInt(int[] arr, int m, int n) {
        assert m >= 0 && m < arr.length;
        assert n >= 0 && n < arr.length;
        int swap = arr[m];
        arr[m] = arr[n];
        arr[n] = swap;
    }
}