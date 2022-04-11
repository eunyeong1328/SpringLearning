package com.spring.diex6;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FriendsMain {

	public static void main(String[] args) {
		
		ApplicationContext context
		= new ClassPathXmlApplicationContext("FriendsSetting.xml");

		FriendsMap friendsMapp = (FriendsMap) context.getBean("friendsList");
		Map<String, String> addfriends = friendsMapp.getFriendsM();
		
		for(Map.Entry<String,String> friends : addfriends.entrySet() ) {
			System.out.println("이름 : " + friends.getKey() + "  소개 : " +  friends.getValue());
		}

	}

}
