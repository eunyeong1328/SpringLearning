package com.spring.diex5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("CollectionSetting.xml");
		//ArrayList Collection!!
//		Exam exam1 = new LecExam(100,200,300);
//		
//		ArrayList<Exam> exams = new ArrayList<Exam>();
//		exams.add(new LecExam(10,20,30));
//		exams.add(exam1);
		ArrayList<Exam> exams = (ArrayList<Exam>) context.getBean("exams");
		
		for(Exam e : exams) {
			System.out.println("exam : "  + e.toString());
		}
		
//		Map<String, String> addrList = new HashMap<String, String>();
//		addrList.put("全辨悼1 ", "己悼备");
//		addrList.put("全辨悼2 ", "价颇备 ");
		
		CollectionMap addrMap = (CollectionMap) context.getBean("addrList");
		Map<String, String> addrList = addrMap.getAddrMap();
		
		for(Map.Entry<String, String> address : addrList.entrySet()) {
			System.out.println(" 捞抚 : " + address.getKey() + " 林家 : " + address.getValue());
		}
		
		//3. Set Collection !!
//		Set<String> names = new HashSet<String>();
//		names.add("全辨悼1");
//		names.add("全辨悼2");
//		names.add("全辨悼2");
		
		CollectionSet nameset = (CollectionSet) context.getBean("nameset");
		Set<String> names = nameset.getNames();
		
		
		for(String name : names) {
			System.out.println("name : " + name);
		}
		
		
	
	}

}
