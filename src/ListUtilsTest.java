import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class ListUtilsTest {
    List<Integer> integerList = Arrays.asList(23, 4, 5, 6, 5, 6, 6, 7, 6, 8, 758, 758);

    @Test
    public void testPartitionByTwo(){
        List<List<Integer>> partitionedList = ListUtils.partition(integerList, 2);
        assertEquals("[[23, 4], [5, 6], [5, 6], [6, 7], [6, 8], [758, 758]]", partitionedList.toString());
    }

    @Test
    public void testPartitionByThree(){
        List<List<Integer>> partitionedList = ListUtils.partition(integerList, 3);
        assertEquals("[[23, 4, 5], [6, 5, 6], [6, 7, 6], [8, 758, 758]]", partitionedList.toString());
    }

    @Test(expected=ArithmeticException.class)
    public void testPartitionByZero(){
        ListUtils.partition(integerList, 0);
    }

}
