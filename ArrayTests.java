import static org.junit.Assert.*;
import org.junit.*; 

public class ArrayTests { 
	@Test 
	public void testReverseInPlace() {
    int[] input = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input);
	}

    @Test
    public void testReversed() {
      int[] input2 = {1, 2, 3, 4, 5};
      assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayExamples.reversed(input2));
    }

    @Test
    public void testAverageWithoutLowest() {
      double[] input1 = {};
      double[] input2 = {1};
      double[] input3 = {2, 4, 6, 1, 10};
      assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0);
      assertEquals(0, ArrayExamples.averageWithoutLowest(input2), 0);
      assertEquals(5.5, ArrayExamples.averageWithoutLowest(input3), 0);
    }
}
