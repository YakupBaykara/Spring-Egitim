package com.proje.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.proje.model.Product;

@Aspect
@Component
public class Log {

	// AFTERRETURNİNG
	
	// Sadece return olan metodlar için kullanılır. Pointcut' u ayrı bir metod olarak yazmaya gerek yok.
	
	@AfterReturning(pointcut = "execution (public * com.proje.repository.*.findProduct(*))", returning = "product")
	public void afterReturningAdvice(JoinPoint joinPoint, Product product) {
		
		System.out.println("Metod return işlemi yaptıktan sonra başlıyor : " +joinPoint);
		System.out.println("Return edilen değer : " +product);
	}
	
	// AFTERTHROWİNG
	
	@AfterThrowing(pointcut = "execution (public * com.proje.repository.*.findProduct(*))", throwing = "exception")
	public void afterThrowinggAdvice(JoinPoint joinPoint, RuntimeException exception) { 
	//Hata tipi RuntimeException olursa tüm hatalarda işlem yapar. Sadece bir hata için isteniyorsa o hata türü yazılır.	
		
		System.out.println("Metod throw ettikten sonra başlıyor : " +joinPoint);
		System.out.println("Hata : " +exception);
	}
	
	//AROUND
	// Around metodunun dönüş tipi Object te olabilir. Null obke--ject oluşturulup object = proceedingJointPoint.proceed() yapılır.
	
	@Around(value="pointCutRepository()")
	public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
			
		try {
			System.out.println("Around başladı : " +proceedingJoinPoint);
			proceedingJoinPoint.proceed();
			System.out.println("Around bitti : " +proceedingJoinPoint);
		}catch (Throwable e) {
			System.out.println("Hata : " +e);
		}
	}
	
	@Pointcut("within (com.proje.repository.*)")
	public void pointCutRepository() {}
	
	// SPECİAL ANNOTATİON
	// Artık loglanmasını istediğimiz metodların üzerine @LogAnnotation yazarız. O metodların logları tutulur
	@Around("@Annotation (com.proje.aop.LogAnnotation)")
	public void aroundAdvice2(ProceedingJoinPoint proceedingJoinPoint) {
			
		try {
			System.out.println("Around başladı : " +proceedingJoinPoint);
			proceedingJoinPoint.proceed();
			System.out.println("Around bitti : " +proceedingJoinPoint);
		}catch (Throwable e) {
			System.out.println("Hata : " +e);
		}
	}
}
