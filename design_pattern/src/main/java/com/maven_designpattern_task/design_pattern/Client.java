package com.maven_designpattern_task.design_pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import adapter_pattern.Employee;
import adapter_pattern.EmployeeAdapter;
import adapter_pattern.Job;
import composite_pattern.App;
import factory_method_pattern.LanguageCheck;
import factory_method_pattern.ProgrammingLanguage;
import observer_pattern.Youtube;
import singleton_pattern.SingletonClass;
import state_pattern.StatePattern;




public class Client {
	private static Logger Logger = LogManager.getLogger(Client.class);

	public static void main(String[] args) {
		
		//Singleton Pattern
		Logger.warn("This is example of Singleton Pattern Method");
		SingletonClass st1 = SingletonClass.getInstance();
		SingletonClass st2 = SingletonClass.getInstance(); 
		Logger.info("Output of first singleton Object :");
		Logger.warn(st1);
		Logger.info("Output of second singleton Object :");
		Logger.warn(st2);
		if(st1==st2) {
			Logger.info("Both the objects are equal ");
		}
	
		//Factory Method Pattern
		Logger.warn("This is example of Factory Pattern Method");
		LanguageCheck lc = new LanguageCheck();
		ProgrammingLanguage pl = lc.getInstance("1");
		String data1 = pl.languageName();
		Logger.info(data1);
		ProgrammingLanguage pl1 = lc.getInstance("2");
		String data2 = pl1.languageName();
		Logger.info(data2);
		
		
		//Adapter Pattern Method
		Logger.warn("Example of Adapter Pattern");
		Job j = new Job();
		Employee e = new EmployeeAdapter();
		j.setEmployee(e);
		j.whatJob("I am an employee of EPAM");
			
		//Composite Pattern Method
		Logger.warn("Example of Composite Pattern");
		App ap = new App();
		ap.showData();
				
		//Observer Pattern Method
		Logger.warn("Example of Observer Pattern");
		Youtube yt = new Youtube();
		yt.youTube();
				
		//State Pattern Method
		Logger.warn("Example of State Pattern");
		StatePattern spt = new StatePattern();
		spt.manageState();
	}

}
