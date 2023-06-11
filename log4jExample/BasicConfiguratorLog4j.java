package log4jExample;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorLog4j {
	
	public static void main(String[] args) {
		
		Logger logger=Logger.getLogger(BasicConfiguratorLog4j.class);//Factory design patten used in DD framework
		
		BasicConfigurator.configure();
		logger.fatal("This is fatal message");
		logger.error("This is error message");
		logger.info("This is info message");
		logger.warn("This is warn message");;
		logger.debug("This is debug message");
	}

}
