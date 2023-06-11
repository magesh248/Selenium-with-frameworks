package log4jExample;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XMLpropertyfileLog4j {
	
	
	
	public static void main(String[] args) {
	 Logger logger =Logger.getLogger(XMLpropertyfileLog4j.class);
		
		
		
		DOMConfigurator.configure("Log4j.xml");
		logger.fatal("This is fatal message");
		logger.error("This is error message");
		logger.info("This is info message");
		logger.warn("This is warn message");;
		logger.debug("This is debug message");
		
		
		
	}

}
