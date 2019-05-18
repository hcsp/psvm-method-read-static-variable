package com.github.hcsp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void importStringUtilsCorrectly() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos, true));

        Main.main(null);

        assertTrue(new String(baos.toByteArray()).toLowerCase().contains("hello"));
    }

    @Test
    public void hasMessageMember() throws Exception {
        Field field = Main.class.getDeclaredField("message");
        field.setAccessible(true);
        assertEquals(field.get(null).toLowerCase(), "hello");
    }
}
