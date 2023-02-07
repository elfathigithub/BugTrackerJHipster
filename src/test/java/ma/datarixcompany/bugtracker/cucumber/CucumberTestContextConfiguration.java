package ma.datarixcompany.bugtracker.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import ma.datarixcompany.bugtracker.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
