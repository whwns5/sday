package yong.aop;

import org.aspectj.lang.ProceedingJoinPoint;
/*
 * AOP 란.
 *  핵심 업무를 처리하기전에 해야되는 선처리나, 핵심 업무를 처리한후 수행해야 할 후처리를
 *  관리
 */
public class TimeChecker {

	// ProceedingJoinPoint 해당 매개변수 유무에 따라 advise 판별
	// 내가 다음에 어떤 녀석이 수행되어야 할지에 대한 정보등을 가지고 있다.
	// 수행 요청에 대한 정보..
	public Object yongTime(ProceedingJoinPoint joinpoint){
		
		// 핵심 업무를 수행하기 전에 수행되어야 하는
		// 1. 선처리
		System.out.println("[yongTime 기동됨!]");
		long start = System.currentTimeMillis();
		
		Object result = null;
		try {
			// 핵심 로직 수행
			result = joinpoint.proceed(); //내 다음의 호출해야되는 대상자 
		} catch (Throwable e) {
			e.printStackTrace();
		} 
		
		// 2. 후처리
		long end = System.currentTimeMillis();
		System.out.println("경과시간 : " + (end - start) + "ms");
		System.out.println("[yongTime 종료됨!]");
		
		return result;
	}
}
