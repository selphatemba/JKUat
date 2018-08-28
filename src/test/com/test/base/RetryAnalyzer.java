package com.test.base;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int count=0;
    private int maxCount=5;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess())
        {
            if (count< maxCount)
            {
                count++;

                iTestResult.setStatus(ITestResult.FAILURE);
                return true;

            }else{
                iTestResult.setStatus(ITestResult.FAILURE);  //If maxCount reached,test marked as failed
            }
        } else {
            iTestResult.setStatus(ITestResult.SUCCESS);      //If test passes, TestNG marks it as passed
        }
        return false;

    }

}