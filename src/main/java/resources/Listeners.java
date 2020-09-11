package resources;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners implements ITestListener {

    BaseClass b = new BaseClass();

    public void onFinish(ITestContext arg0) {

    }

    public void onStart(ITestContext arg0) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {


    }

    public void onTestFailure(ITestResult result) {


        try {
            b.getScreenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult arg0) {


    }

    public void onTestStart(ITestResult arg0) {


    }

    public void onTestSuccess(ITestResult arg0) {

    }

}
