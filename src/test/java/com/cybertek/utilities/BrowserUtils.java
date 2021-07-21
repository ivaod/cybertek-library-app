package com.cybertek.utilities;

public class BrowserUtils {


    public static void sleep(int second)  {
        //so for now just throw it outside of the method
        //what are we doing is -> we are multiplying  1sec = 1000 milli seconds
        //1 * 1000 = 1000
        //we want to pass only one second not every time to give 1000, 2000 milli seconds
        //passing seconds instead of milliseconds
        //BrowserUtils.sleep(!); -> 1 second
        second *= 1000;

        //try catch allows to execute the code
        try { //we only have 2 blocks here -> 1 one click here TRY is i want you to TRY this code here and CATCH me
            // this specific Exception does whatever we have in CATCH block(?so it does not stop my code)
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }



}
