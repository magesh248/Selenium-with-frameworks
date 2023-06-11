package log4jExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyfileLog4j {
	
	public static void main(String[] args) {
		
		
		Logger logger =Logger.getLogger(PropertyfileLog4j.class);
		
		
		PropertyConfigurator.configure("Log4j.properties");
		logger.fatal("This is fatal message");
		logger.error("This is error message");
		logger.info("This is info message");
		logger.warn("This is warn message");;
		logger.debug("This is debug message");
		
	}

}
