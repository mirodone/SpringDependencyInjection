package ro.mirodone.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//retrieve bean from spring container
		HandballCoach theCoach = context.getBean("myHandballCoach", HandballCoach.class);

		// call methods on the bean

		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmailAddress());

		System.out.println(theCoach.getTeamName());
		

		// close the context
		context.close();
	
		
		
		

	}

}
