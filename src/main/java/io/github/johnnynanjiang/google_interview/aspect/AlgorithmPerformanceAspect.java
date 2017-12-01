package io.github.johnnynanjiang.google_interview.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by nanjiang on 27/11/17.
 */

@Component
@Aspect
public class AlgorithmPerformanceAspect {
    @After("execution(* io.github.johnnynanjiang.google_interview.sorting..*(..))")
    protected void logAfter(JoinPoint joinPoint) {
        printMessage("After", joinPoint);
    }

    //@Around("execution(* io.github.johnnynanjiang.google_interview.sorting..*(..))")
    public void userAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
        printMessage("Around before ", joinPoint, "timestamp:" + new Date());
        joinPoint.proceed();
        printMessage("Around after ", joinPoint, "timestamp:" + new Date());
    }

    private void printMessage(String pointcut, JoinPoint joinPoint) {
        printMessage(pointcut, joinPoint, "");
    }

    private void printMessage(String pointcut, JoinPoint joinPoint, String message) {
        System.out.println(
                String.format("*** @%s: %s.%s(), %s",
                        pointcut,
                        joinPoint.getSignature().getDeclaringTypeName(),
                        joinPoint.getSignature().getName(),
                        message)
        );
    }
}
