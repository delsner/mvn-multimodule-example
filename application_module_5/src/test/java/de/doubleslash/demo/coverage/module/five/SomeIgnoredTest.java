package de.doubleslash.demo.coverage.module.five;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@Ignore
public class SomeIgnoredTest {

    @Test
    public void testTrueIsTrue() {
        assertThat(true, is(true));
    }

}
