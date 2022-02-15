package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { //It is like a dependencies. It is giving features.
                "pretty", //This is used for more readable reports.Console report is going to be better.
                "html:target/default-cucumber-reports.html", //USE THIS REPORT
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/failedRerun.txt" //for failed class.


        }, //Dont  forget to put ","
        features = "./src/test/resources/features",
        glue = {"stepdefinitions","Hooks"}, //point the stespdefinition
        //runs stepdefinitions and Hoos folder
        tags="@user_creation",//SCENARIO LARI TEKER TEKER RUN EDILMESINI SAGLAR.
        dryRun = false
        //When we run it,It will give missing part without waste of time.
        //It will give missing part quickly.When we add new step, Add this step.
        //dryRun = true(SAVES TIME)
        //dryRun = false(IT IS GOING TO OPEN BROWSER AND WASTE TIME)
        //Eger browser acip gormek istersen. dryRun=false yaparak bu isi cozebilirsin.
)
public class Runner {
}
/*Runner is used to run the feature files(Test Cases)
 *@RunWith : This makes the class runnable.
 *@CucumberOptions :
     -add path of features folder and  step definitions folder,
     -tags
     -dryRun
     -Report plugins
     -failedRunner plugin
     -etc..
 *What is the role of?
     -features: path of features folder.
     -glue    : path of step definitions folder
     -tags    : to run individual or multiple features or scenarios
     For example, if I pass tag multiple feature, then all features with that tag will run
 *dryRun: to check if there is any "missing step definition"
        : dryRun can be true OR false
        : dryRun=false default behaviour.Runs the test on the browser while checking the missing part.
        : dryRun=true  do not run test on the browser adn check if there is any missing step definition
 NOTE: dryRun will stop opening the browser to save time.
       It does not matter if the code is right or wrong.
       We do not have to watch the screen from now on



 */