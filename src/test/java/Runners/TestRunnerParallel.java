package Runners;

import Utilities.GWD;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags="@RegressionTest", //hangi senaryolarda bu etiket varsa çalıştıracak
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"html:target\\cucumber-reports.html"}
)



        @Listeners({ExtentITestListenerClassAdapter.class})
public class TestRunnerParallel extends AbstractTestNGCucumberTests {

    @BeforeClass(alwaysRun = true)
    @Parameters("browser")
    public void beforeClass(String browser) {
        GWD.threadBrowserName.set(browser);
        //burada browser set edilecek
        //bu thread browsername'e set edilecek



    }
}
