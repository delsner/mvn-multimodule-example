package de.doubleslash.demo.multimodule.coverage.four.config;

import de.doubleslash.demo.multimodule.coverage.four.models.SimpleInterface;
import de.doubleslash.demo.multimodule.coverage.four.models.SimpleInterfaceBeanMain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainBeanConfig {

    @Bean
    public SimpleInterface simpleInterfaceMain() {
        return new SimpleInterfaceBeanMain();
    }
}
