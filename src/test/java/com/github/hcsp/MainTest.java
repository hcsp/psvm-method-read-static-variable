package com.github.hcsp;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import java.lang.reflect.Field;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    @CaptureSystemOutput
    public void importStringUtilsCorrectly(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsStringIgnoringCase("hello"));
        Main.main(null);
    }

    @Test
    public void hasMessageMember() throws Exception {
        Field field = Main.class.getDeclaredField("message");
        field.setAccessible(true);
        Assertions.assertEquals(field.get(null).toString().toLowerCase(), "hello");
    }
}
