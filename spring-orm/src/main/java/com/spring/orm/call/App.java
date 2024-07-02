package com.spring.orm.call;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.beans.Student;
import com.spring.orm.dao.StudentDAO;


public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
    
        ApplicationContext context = new ClassPathXmlApplicationContext("springorm.config.xml");
        
        StudentDAO sdao = context.getBean("studentDAO",StudentDAO.class);
        Student s = new Student(1012,"Arbaz Khan","LNCT");
        int rs = sdao.insert(s);
        System.out.println(rs);
    }
}
