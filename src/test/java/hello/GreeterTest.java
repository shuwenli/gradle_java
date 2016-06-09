package hello;
import static org.junit.Assert.*;
import org.junit.Test;

  public class GreeterTest {
    @Test
    public void test_max_1_2_3() {
          assertEquals(3, Greeter.max(1, 2, 3));
    }

   @Test
    public void test_max_1_3_2() {
          assertEquals(3, Greeter.max(1, 3, 2));
    }

    @Test
    public void test_max_3_2_1() {
          assertEquals(3, Greeter.max(3, 2, 1));
    }

    @Test
    public void test_max_2_1_3() {
          assertEquals(3, Greeter.max(2, 1, 3));
    }
}
