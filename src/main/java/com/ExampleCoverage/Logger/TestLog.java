package com.ExampleCoverage.Logger;

import org.apache.log4j.Logger;

public class TestLog {

	
	private static Logger log=Logger.getLogger(TestLog.class);
			
	public static void main(String[]args) {
//		Layout layout =new PatternLayout("%C  :[%m]: --%L %n");
//		Appender app=new ConsoleAppender(layout);
//		log.addAppender(app);
		
		log.debug("debug example");
		log.info("info example");
		log.warn("warn message");
		log.error("errror message");
		log.fatal("fatal message");
		
	}
}
