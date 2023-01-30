import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},features = "src/test/features", tags= "@bag", dryRun = false,glue="main/java/stepDefinitions")
public class Run {
}
