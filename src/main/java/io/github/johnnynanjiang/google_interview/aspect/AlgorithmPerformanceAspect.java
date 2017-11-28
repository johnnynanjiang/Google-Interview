package io.github.johnnynanjiang.google_interview.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

/**
 * Created by nanjiang on 27/11/17.
 */

@Component
@Aspect
public class AlgorithmPerformanceAspect {
    @Before("execution(* io.github.johnnynanjiang.google_interview.sorting..*(..))")
    protected void logAfter(JoinPoint joinPoint) {
        System.out.println(
                String.format("*** logAfter() is running, %s",
                        joinPoint.getSignature().getName())
        );
    }
}
