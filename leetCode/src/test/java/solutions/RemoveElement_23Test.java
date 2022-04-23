package solutions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElement_23Test {

    @Test
    void removeElement() {

        int[] arr = new int[] {0,1,2,2,3,0,4,2};
        RemoveElement_23 removeElement_23 = new RemoveElement_23();
        int res = removeElement_23.removeElement(arr, 2);
        System.out.println(res);
        System.out.println(Arrays.toString(arr));
    }
}