package com.example.testspringboot.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Slf4j
@Aspect
public class LoggingConfig {

    @AfterReturning("execution(* com.example.testspringboot.services.VehicleServiceImpl.addVehicleReservationAndAffectToWashingservicee(..))")
    public void logMethod(JoinPoint joinPoint) {
        log.info("Waiting for a Worker");
    }

    //@Around("execution(* com.example.testspringboot.services.WorkerServiceImpl.*(..))")
    public Object calculateExecutionTime(ProceedingJoinPoint joinPoint) {
        try {
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            Object proceed = joinPoint.proceed();
            stopWatch.stop();
            log.info("Execution of : " + joinPoint.getSignature().getName() +
                    " lasted for : " + stopWatch.getTotalTimeSeconds() + " secs");
            return proceed;
        } catch (Throwable e) {
            log.error(e.getMessage());
            return null;
        }
    }
}
