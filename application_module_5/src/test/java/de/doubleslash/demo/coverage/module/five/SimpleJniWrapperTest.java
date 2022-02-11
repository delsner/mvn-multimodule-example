package de.doubleslash.demo.coverage.module.five;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SimpleJniWrapperTest {

    @Test
    public void testJniGetString() {
        JniWrapper jni = new JniWrapper();
        assertThat(jni.getString(), is("Hello world!"));
    }

}
