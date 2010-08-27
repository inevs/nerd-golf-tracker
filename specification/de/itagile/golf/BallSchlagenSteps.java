package de.itagile.golf;


import org.jbehave.scenario.annotations.Alias;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class BallSchlagenSteps extends BaseSteps {

    private TrackerDriver driver;
    
    public BallSchlagenSteps(TrackerDriver driver) {
		this.driver = driver;
	}

	@When("ich den Ball einmal schlage,")
    @Alias("ich den Ball noch einmal schlage,")
    public void schlageBall() {
        driver.schlageBall();
    }
    
    @Then("zählt der NerdGolfTracker $anzahl $einheit.")
	public void zaehltSchlaege(int anzahl, String einheit) throws Exception {
		driver.zaehltSchlaege(anzahl, einheit);
	}
	

}