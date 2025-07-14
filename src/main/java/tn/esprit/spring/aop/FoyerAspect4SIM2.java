package tn.esprit.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect // Pour considérer cette classe comme "Aspect"
@Component // Pour considérer cette classe comme "Bean Spring"
@Slf4j
public class FoyerAspect4SIM2 /* La classe: Aspect */  {
    // Les méthodes : Advices

    @After("execution(* tn.esprit.spring.services..*.*(..))")
    public void afterAdvice(JoinPoint jp){
        log.info("ranni 5rajt mil méthode "+jp.getSignature().getName());
    }

    // @AfterReturning()
    // @AfterThrowing()

    @Before("execution(* tn.esprit.spring.services..*.*(..))")
    public void beforeAdvice(JoinPoint jp){
        log.info("ranni d5alt lil méthode "+jp.getSignature().getName());
    }

    @Before("execution(* tn.esprit.spring.services..*.ajouter*(..))")
    public void beforeAdvice2(JoinPoint jp){
        log.info("Ranni méthode ajouter");
    }

    @Around("execution(* tn.esprit.spring.services..*.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable
    {
        long start = System.currentTimeMillis();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime + " milliseconds.");
        return null;
    }
}
