package ru.sadovskaya.postProcessors;

import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import ru.sadovskaya.reflection.Default;

@Component
@ToString
public class TesterBean {
    String name;
    @Default("alias")
    String alias;
    @Default("x")
    Integer x;
}

@Configuration
class Config{
    @Bean
    String alias(){
        return "test";
    }

    @Bean
    Integer x(){
        return 77;
    }
}
