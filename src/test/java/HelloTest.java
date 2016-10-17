import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;


/**
 * User: skumbera
 * Date: 17.10.16
 * Time: 17:13
 */
public class HelloTest {

    @Test
    public void testHello() {
        assertThat(new Hello().greeting(), containsString("Hello"));
    }
}
