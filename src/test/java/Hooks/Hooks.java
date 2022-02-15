package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUp(){
        //RUNS BEFORE EACH SCENARIO
        System.out.println("Before Hooks");
    }
//    @After
//    public void tearDown(){
//        //RUNS AFTER EACH SCENARIO
//        System.out.println("After Hooks");
//
//    }
    @After
    public void tearDown(Scenario scenario){
        //"CUT THIS PART" final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        //When we choose "BYTES", return type will be BYTE.
        //when we are using BYTES, it is fastest way.
        if (scenario.isFailed()) {
            //If a scenario fails, then take  the screenshot!
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");
        }
        //Driver.closeDriver();
    }
}
