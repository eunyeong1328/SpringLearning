package com.spring.diex8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//<context:component-scan base-package="com.spring.diex7" />
//
//<bean id="exam2" class="com.spring.diex7.LecExam2"
//	p:kor="100" p:eng="200" p:math="300" />

@ComponentScan("com.spring.diex7")
@Configuration
public class ProgramConfig {
	//<bean id="exam" class="com.spring.diex7.LecExam"
    //	p:kor="10" p:eng="20" p:math="30" />
	@Bean
	public Exam exam() {
		return new LecExam(10, 20, 30);
	}
	
	//<bean id="eCon" class="com.spring.diex4.MultipleLineExamPrint">
	//	<property name="exam" ref="exam" />
	//</bean>
	@Bean
	public ExamConsole eCon() {
		return new MultipleLineExamPrint();
	}

	
	
	

	
}

