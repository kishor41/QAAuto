package com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@Runwith(Cucumber.class)
@CucumberOptions(features= "src/test/resources", tags ={@Register})




public class RunCukes {

}
