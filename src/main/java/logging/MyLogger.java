package logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by leonid on 02.03.2017.
 */
@Component
@Aspect
public class MyLogger {

    @Pointcut(value="execution(* *(..))")
    private void loggerPointCut() {
    }

    @Around("loggerPointCut()")
    public Object watchTime(ProceedingJoinPoint joinpoint) {
        long start = System.currentTimeMillis();
        System.out.println("method begin: " + joinpoint.getSignature().toShortString());
        Object output = null;
        try {
            output = joinpoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        long time = System.currentTimeMillis() - start;
        System.out.println("method finished: " + joinpoint.getSignature().toShortString() + ", time=" + time + " ms");

        return output;
    }
}
