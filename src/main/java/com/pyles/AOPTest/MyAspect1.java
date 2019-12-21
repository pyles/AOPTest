package com.pyles.AOPTest;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect1 {
	
		@Pointcut("@annotation(Annotation1)")
		public void annotated() {}
		
		@Before("annotated()")
		public void printABit() {
			System.out.println("Aspect1");
		}
}
