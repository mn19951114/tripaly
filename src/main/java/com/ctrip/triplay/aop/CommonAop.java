package com.ctrip.triplay.aop;

import com.alibaba.fastjson.JSON;
import com.ctrip.triplay.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
@Slf4j
public class CommonAop {

//    @Pointcut("execution(* com.ctrip.triplay.controller..*.*(..))")
//    private void controllerPointcut() {}
//
//    @Around("controllerPointcut()")
//    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable {
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//        Object[] args = joinPoint.getArgs();
//        StringBuilder argStr = new StringBuilder();
//        for (Object arg : args) {
//            argStr.append(JSON.toJSONString(arg));
//        }
//        log.debug("start "+signature.getMethod().getName()+" args:"+argStr);
//        try{
//            Object obj = joinPoint.proceed();
//            System.out.println("end "+signature.getMethod().getName()+" response:"+JSON.toJSONString(obj));
//            return obj;
//        }catch (Exception e){
//
//        }
//        return R.ok();
//    }


}
