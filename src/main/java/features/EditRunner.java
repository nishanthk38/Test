package features;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features= "src/main/java/Features/edit.feature"
							,glue= {"hooks","pages"},monochrome=true)
@RunWith(Cucumber.class)
public class EditRunner {

}
