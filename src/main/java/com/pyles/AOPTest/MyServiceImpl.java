package com.pyles.AOPTest;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl {

		@Annotation1
		public void method1() {
			System.out.println("method1");
			method2();
		}
		
		@Annotation1
		public void method2() {
			System.out.println("method2");
		}
		
}
