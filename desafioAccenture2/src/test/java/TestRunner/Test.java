package TestRunner;
        import org.junit.runner.RunWith;
        import io.cucumber.junit.Cucumber;
        import io.cucumber.junit.CucumberOptions;
        import static io.cucumber.junit.CucumberOptions.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Features"}, plugin = {
        "json:target/cucumber-reports/cucumber.json", "html:target/site/cucumber-html-report",
        "junit:target/cucumber.xml",
        "pretty" }, glue = "StepDefinition",
        dryRun = (false), monochrome = (true), snippets = (SnippetType.CAMELCASE),
        strict = (true), tags = "@quote")
public class Test {
}