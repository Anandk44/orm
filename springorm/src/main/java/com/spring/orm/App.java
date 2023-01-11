package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.Dao.StudentDao;
import com.spring.orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
        StudentDao std = con.getBean("studentdao" , StudentDao.class);
        Student s = new Student(1 , "Anand" , "Nagpur");
        int r = std.insert(s);
       
        System.out.println("Done" + r);
        
    }
}
