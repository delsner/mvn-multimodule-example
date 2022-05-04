package de.doubleslash.demo.coverage.module.five;


import org.junit.Ignore;
import org.junit.jupiter.api.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JniWrapperTest {

    @BeforeAll
    public static void beforeClass() throws Exception {
        System.out.println("Before class setup hook.");
    }

    @BeforeAll
    public static void afterClass() throws Exception {
        System.out.println("After class setup hook.");
    }

    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("SetUp");
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.out.println("TearDown");
    }

    @Test
    public void testJniGetString() {
        JniWrapper jni = new JniWrapper();
        assertThat(jni.getString(), is("Hello world!"));
    }

    @Test
    @Ignore
    public void testIgnored() {
        assertThat(true, is(true));
    }

    @Test
    @Disabled
    public void testDisabled() {
        assertThat(true, is(true));
    }

}
