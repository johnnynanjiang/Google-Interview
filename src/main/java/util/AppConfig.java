package util;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sorting.InsertionSort;

/**
 * Created by nanjiang on 20/11/17.
 */

@Configuration
public class AppConfig {
    @Bean
    public InsertionSort getInsertionSort() {
        return new InsertionSort();
    }
}
