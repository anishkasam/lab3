import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

interface StringChecker { boolean checkString(String s); }

public class ListTests {
  @Test
  public void testFilter() {
    StringChecker sc = new StringChecker() {
      @Override
      public boolean checkString(String s) {
        if (!s.equals("anish")) {
          return true;
        }
        return false;
      }
    };

    List<String> input1 = new ArrayList<String>();
    input1.add("anish");
    input1.add("bob");
    input1.add("carl");

    List<String> output = new ArrayList<String>();
    output.add("bob");
    output.add("carl");

    assertEquals(output, ListExamples.filter(input1, sc));
  }

  @Test
  public void testMerge() {
    List<String> input1 = new ArrayList<String>();
    input1.add("anish");
    input1.add("anish");
    input1.add("anish");

    List<String> input2 = new ArrayList<String>();
    input2.add("anish");
    input2.add("bob");
    input2.add("carl");

    List<String> output = new ArrayList<String>();
    output.add("anish");
    output.add("anish");
    output.add("anish");
    output.add("anish");
    output.add("bob");
    output.add("carl");
    
    assertEquals(output, ListExamples.merge(input1, input2));
  }
}
