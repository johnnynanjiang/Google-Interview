package io.github.johnnynanjiang.google_interview.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by nanjiang on 20/11/17.
 */

@Configuration
@ComponentScan({"io.github.johnnynanjiang.google_interview"})
@EnableAspectJAutoProxy
public class AppConfig {

}
