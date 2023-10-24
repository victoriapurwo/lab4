import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class ListTests {
    @Test 
	public void testFilter() {
        List<String> input1 = new ArrayList<>();
        List<String> result1 = new ArrayList<>();
        assertArrayEquals(result1, ListExamples.filter(input1, sc));
	}

    @Test
    public void testMerge() {
      List<String> input1 = new ArrayList<>();
      List<String> input2 = new ArrayList<>();
      List<String> result = new ArrayList<>();

      input1.add("a");
      input1.add("c");
      input2.add("b");
      input2.add("d");
      result.add("a");
      result.add("b");
      result.add("c");
      result.add("d");

      assertEquals(result, ListExamples.merge(input1, input2));
    }
}
