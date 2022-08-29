package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void max() {
        var arr = new int [][]{{2,5},{4,6}};
        assertEquals(6,Main.max(arr));
    }

    @Test
    void min() {
        var arr = new int[][]{{3,5},{4,6}};
        assertEquals(3, Main.min(arr));
    }

    @Test
    void avg() {
        var arr = new int[][]{{1,3},{3,5}};
        assertEquals(3, Main.avg(arr));
    }
}