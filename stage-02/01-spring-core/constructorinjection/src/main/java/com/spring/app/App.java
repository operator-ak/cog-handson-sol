package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MemberShip memberShip = (MemberShip) context.getBean("membershipObj");
        System.out.println(memberShip);
    }
}
