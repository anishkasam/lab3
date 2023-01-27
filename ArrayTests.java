import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlaceOne() {
    int[] input1 = {1, 2, 2, 1};
    assertArrayEquals(new int[]{1, 2, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceTwo() {
    int[] input1 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4, 3, 2, 1}, input1);
  }

  @Test
  public void testReverseInPlaceThree() {
    int[] input1 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input1);
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input = {1, 1, 1, 2};
    assertEquals(4.0/3, ArrayExamples.averageWithoutLowest(input), 0.0);
  }

  @Test
  public void testJoey() {
    double[] input = {1, 1, 1, 1, 1};
    assertEquals(1.0, ArrayExamples.averageWithoutLowest(input), 0.0);
  }
}
