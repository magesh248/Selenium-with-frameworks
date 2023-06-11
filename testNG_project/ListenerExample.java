package testNG_project;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;


public class ListenerExample implements ITestListener {
    @Override		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub			
    	
    	System.out.println("on finish");
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub	
    	System.out.println("on Start");
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	System.out.println("on TestFailedButWithinSuccessPercentage ");
    }		

    @Override		
    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	System.out.println("on TestFailure");
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	System.out.println("on TestSkipped");
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	System.out.println("on TestStart");
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	System.out.println("on TestSuccess");
    }		
	

}
