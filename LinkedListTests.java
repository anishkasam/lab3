import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LinkedListTests {
    @Test
    public void testAppend() {
        LinkedList input = new LinkedList();
        input.prepend(3);
        input.prepend(2);
        input.prepend(1);

        LinkedList output = new LinkedList();
        output.prepend(1);
        output.append(2);
        output.append(3);

        assertEquals(input.toString(), output.toString());
    }

    @Test(expected = NoSuchElementException.class)
    public void testFirst() {
        LinkedList input = new LinkedList();
        assertEquals(null, input.first());
    }
}
