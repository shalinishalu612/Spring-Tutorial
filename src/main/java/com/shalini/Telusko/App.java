package com.shalini.Telusko;
//import com.shalini.Telusko.Vehicle;
//import com.shalini.Telusko.Car;
//import com.shalini.Telusko.Bike;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Car car=new Car();
//        car.drive();
//    	Vehicle obj=new Car();
//    	obj.drive();
//    	Vehicle obj=new Bike();
//    	obj.drive();
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	Vehicle obj=(Vehicle)context.getBean("vehicle");
    	obj.drive();
    	
    	
    }
}
