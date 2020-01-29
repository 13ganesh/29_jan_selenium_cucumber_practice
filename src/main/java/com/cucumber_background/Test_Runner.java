package com.cucumber_background;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature_Background"
		,glue = "step_defination118"
		//,tags = {"@SmokeTest"}
		//,tags = {"@RegressionTest"}
		//,tags = {"@FunctionalTest"}
		//,tags = {"@SmokeTest,@RegressionTest"} //or tagged
		//,tags = {"@SmokeTest","@RegressionTest"} // and tagged
		//,tags = {"@SmokeTest","~@RegressionTest"} // ignoring regressionTest
		//,tags = {"~@SmokeTest","~@RegressionTest","~@End2End"} // without tag scenario
		)

public class Test_Runner {


}
