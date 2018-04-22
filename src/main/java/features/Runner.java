package features;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features= "src/main/java/Features/create.feature"
							,glue= {"hooks","pages"},tags= {"@smoke","@sanity"})
@RunWith(Cucumber.class)
public class Runner {

}

