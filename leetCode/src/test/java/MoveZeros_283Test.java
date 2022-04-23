import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeros_283Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void moveZeroes() {
        MoveZeros_283 moveZeros_283 = new MoveZeros_283();
        int[] testData = new int[]{1, 0, 2, 0, 3};
        moveZeros_283.moveZeroes(testData);
        System.out.println(Arrays.toString(testData));
    }
}