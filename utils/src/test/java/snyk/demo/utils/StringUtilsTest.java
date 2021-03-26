package snyk.demo.utils;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringUtilsTest {
    @Test
    public void shouldDefaultToNoArguments() {
        String paddedString = StringUtils.leftPad("foo", '-', 2);
        assertEquals(paddedString, "--foo");
    }
}
