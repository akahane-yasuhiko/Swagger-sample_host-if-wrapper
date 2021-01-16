package io.swagger.log;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {
	private static final Logger log = LoggerFactory.getLogger(LogAdvice.class);

	@Around("execution(public * hoge.*.*(..)) || @annotation(Log)")
	public Object logging(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		String sig = proceedingJoinPoint.getSignature().toShortString();

		try {
			//        	log.info("START {}", method);
			log.info("START " + sig + "" + Arrays.toString(proceedingJoinPoint.getArgs()));
			Object ret = proceedingJoinPoint.proceed();
			log.info("END  " + sig + "" + ret);
			return ret;
		} catch (Throwable t) {
			//            log.warn("{} failed.", method);
			log.info("CATCH " + sig + " " + t);
			throw t;
		} finally {
			//            stopWatch.stop();
			//            log.info("END {}", method);
		}
	}
}
