package top.caoayu.livehelper.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

@Aspect
public class LogInterceptor {
    @Around("execution(* top.caoayu.livehelper.service.*.*(..))")
    public Object Hanlde(ProceedingJoinPoint pjp) throws Throwable {
        Method method = ((MethodSignature)pjp.getSignature()).getMethod();
        System.out.println("execution: " + method.getName());

        return pjp.proceed();
    }
}
