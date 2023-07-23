package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(features= {"src/test/java/features/signIn.feature"},
dryRun=false,
glue="stepdefinition",
snippets=SnippetType.CAMELCASE,
monochrome=true
)
public class Runnersclass extends AbstractTestNGCucumberTests {

}
