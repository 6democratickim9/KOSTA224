package org.kosta.aop;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class PerformanceReportService {
	private Logger log=LogManager.getLogger(getClass());
	public Object timeLogging(ProceedingJoinPoint point) throws Throwable{
		Object retValue=null;
		StopWatch watch=new StopWatch();
		watch.start();
		try {
			retValue=point.proceed();
		}finally {
			watch.stop();
			long time=watch.getTotalTimeMillis();
			if(time>=500&&time<1000) {
				String className=point.getTarget().getClass().getName();
				String methodName=point.getSignature().getName();
				log.warn(className+" "+methodName+" "+time);
			}else if(time>=1000) {
				String className=point.getTarget().getClass().getName();
				String methodName=point.getSignature().getName();
				log.error(className+" "+methodName+" "+time);
				}
		}
	return retValue;
	}

}
