package de.doubleslash.demo.coverage.module.five;


import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

import static org.hamcrest.CoreMatchers.is;

class LoggingExtension implements TestInstancePostProcessor {

    @Override
    public void postProcessTestInstance(Object testInstance,
                                        ExtensionContext context) throws Exception {
        System.out.println("Post-Processing " + testInstance + " in Ctx: " + context);
    }
}

@ExtendWith(LoggingExtension.class)
public class SomeSuiteWithExtension {

    @Test
    public void testSimple() {
        MatcherAssert.assertThat(true, is(true));
    }
}
