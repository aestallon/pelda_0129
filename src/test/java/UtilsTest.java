import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtilsTest {

    @Test
    public void emptyArraysMax_ShouldBeMinus1() {
        int[] array = new int[0];
        assertEquals(-1, Utils.maxker(array));
    }

    @Test
    public void ifArgumentIsNull_IndexShouldBeMinus1() {
        assertEquals(-1, Utils.maxker(null));
    }

    @Test
    public void OneLengthArray_Gives0() {
        int[] array = { 25 };
        assertEquals(0, Utils.maxker(array));
    }

    @Test
    public void SortedArraysMaxShouldBeTheLastIndex() {
        int[] array = {3,6,5,25,42,36,89};
        int expected = array.length - 1;
        assertEquals(expected, Utils.maxker(array));
    }

    @Test
    public void reverseSortedArrayGivesIndex0AsMax() {
        int[] array = {45,32,16,8,7,6,-5,-25};
        int expected = 0;
        assertEquals(expected, Utils.maxker(array));
    }

    @Test
    public void IfTheMaxElementIsTheFifth_maxkerShouldGive4() {
        int[] array = {
                12,45,65,78,
                25_999,
                64,98,75,1,2
        };

        int expected = 4;
        assertEquals(expected, Utils.maxker(array));
    }
}
