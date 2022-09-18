package Runners;

import Utilities.GWD;
import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;


@CucumberOptions(

        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"} )
@Listeners({ExtentITestListenerClassAdapter.class})

public class TestRunner_ExtentReport extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("User Name", "Grup 15");
        ExtentService.getInstance().setSystemInfo("Application Name", "Mersys");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Team Members", "Emrah Düzgit, Oğuzhan Uğurlu, Kadir Hacıtemelpğlu, Nurhayat Köklü");
    }


}
