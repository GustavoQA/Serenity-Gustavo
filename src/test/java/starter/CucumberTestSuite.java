package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "starter/stepdefinitions",
        tags = "@PruebaSerenity")
public class CucumberTestSuite {
}

//NOTA : para ejecutar en consola (terminal)
//             PARA MVN
//mvn clean verify -Dtags="@PruebaSerenity"
//        mvn clean verify -Ddriver=firefox
//            PARA GRADLEW
//        ./gradlew clean test
