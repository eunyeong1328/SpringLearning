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
//		addrList.put("ȫ�浿1 ", "������");
//		addrList.put("ȫ�浿2 ", "���ı� ");
		
		CollectionMap addrMap = (CollectionMap) context.getBean("addrList");
		Map<String, String> addrList = addrMap.getAddrMap();
		
		for(Map.Entry<String, String> address : addrList.entrySet()) {
			System.out.println(" �̸� : " + address.getKey() + " �ּ� : " + address.getValue());
		}
		
		//3. Set Collection !!
//		Set<String> names = new HashSet<String>();
//		names.add("ȫ�浿1");
//		names.add("ȫ�浿2");
//		names.add("ȫ�浿2");
		
		CollectionSet nameset = (CollectionSet) context.getBean("nameset");
		Set<String> names = nameset.getNames();
		
		
		for(String name : names) {
			System.out.println("name : " + name);
		}
		
		
	
	}

}
