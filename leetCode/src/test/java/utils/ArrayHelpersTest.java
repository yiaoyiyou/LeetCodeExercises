package utils;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayHelpersTest {

    @Test
    void swapEle() {
        Integer[] arr = new Integer[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        ArrayHelpers.swapEle(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
}