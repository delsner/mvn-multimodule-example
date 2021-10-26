package de.doubleslash.demo.multimodule.coverage.four.config;

import de.doubleslash.demo.multimodule.coverage.four.models.SimpleInterface;
import de.doubleslash.demo.multimodule.coverage.four.models.SimpleInterfaceBeanPrimary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryBeanConfig {

    @Bean
    @Primary
    public SimpleInterface simpleInterfacePrimary() {
        return new SimpleInterfaceBeanPrimary();
    }
}
