package com.proje.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {

//	@Before("execution (public void com.proje.repository.ProductRepository.saveProduct(*))")
//	@Before("execution (public * com.proje.repository.ProductRepository.saveProduct(*))")  // Dönüş tipi farketmez. Parametreli
//	@Before("execution (public * com.proje.repository.*.deleteProduct(*))")  // Dönüş tipi farketmez. Repositoy paketinde bu metodu gördüğü her yerde. Parametreli
//	@Before("execution (public * findProduct())") //  Bu metodu gördüğü her yerde. Dönüş tipi farketmez. Parametresiz
//	@Before("execution (* findProduct(*))")   // Bu metodu gördüğü her yerde. Dönüş tipi farketmez. Parametreli
//	@Before("execution (* findProduct(..))")  // Bu metodu gördüğü her yerde. Dönüş tipi farketmez. Parametreli veya parametresiz
//	@Before("pointCutSaveProduct()")
	@Before("pointCutProductRepostory()")
	public void beforeAdvice(JoinPoint joinPoint) {
		
//		System.out.println("Veri kaydetme işlemi başlıyor : " + joinPoint); 
		System.out.println("İşlem başlıyor : " +joinPoint);
		System.out.println("İşlem başlıyor : " +joinPoint.getKind());
		System.out.println("İşlem başlıyor : " +joinPoint.getSignature());
		System.out.println("İşlem başlıyor : " +joinPoint.getTarget());
	}
	

//	@After("execution (public void com.proje.repository.ProductRepository.saveProduct(*))")
//	@After("pointCutSaveProduct()")
	@After("pointCutProductRepostory()")
	public void afterAdvice(JoinPoint joinPoint) {
		
//		System.out.println("Veri kaydetme işlemi bitti : " +joinPoint);
		System.out.println("İşlem bitti : " +joinPoint);
	}
	
	@Pointcut("execution (public void com.proje.repository.ProductRepository.saveProduct(*))")
	public void pointCutSaveProduct() {}

	@Pointcut("within (com.proje.repository.ProductRepository)")   //Adresteki tüm metodlar için 
//	@Pointcut("within (com.proje.repository.*)")
//	@Pointcut("within (com.proje.*.ProductRepository)")
//	@Pointcut("within (com.proje..*)")  Paket içindeki tüm classlar için uygulanır.
	public void pointCutProductRepostory() {}

}
