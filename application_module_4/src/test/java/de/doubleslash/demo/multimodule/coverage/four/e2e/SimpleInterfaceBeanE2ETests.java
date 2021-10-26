package de.doubleslash.demo.multimodule.coverage.four.e2e;


import de.doubleslash.demo.multimodule.coverage.four.models.SimpleInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SimpleInterfaceBeanE2ETests {

    @Autowired
    private SimpleInterface simpleInterface;

    @Test
    public void should_return_valid_exit_code() {
        assertEquals(1, simpleInterface.getExitCode());
    }
}
