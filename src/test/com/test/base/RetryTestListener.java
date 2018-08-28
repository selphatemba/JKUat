package com.test.base;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class RetryTestListener extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult tr) {
        Reporter.setCurrentTestResult(tr);
        super.onTestFailure(tr);
        if(tr.getMethod().getRetryAnalyzer().retry(tr))
            tr.setStatus(ITestResult.SKIP);

        Reporter.setCurrentTestResult(null);

    }


}
