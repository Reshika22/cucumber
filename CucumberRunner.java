package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;


@CucumberOptions(features = {"src/test/java/features/DuplicateLead.feature"} ,
				glue = "steps" ,
				monochrome = true ,
				publish = true ,
				//tags = "@Smoke and @Regression" ,
				dryRun = false
				)
public class CucumberRunner extends BaseClass{

}
