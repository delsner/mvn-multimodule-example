package de.doubleslash.demo.coverage.module.five;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SomeSuiteWithDisabledTests {

    @Test
    @Disabled
    public void testDisabled() {
        assertThat(true, is(true));
    }
}
