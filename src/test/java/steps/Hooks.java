package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Base;

public class Hooks {
	
	@Before
	public void start() {
		Base.setup();
	}
	
	@After
	public void quit() {
		Base.tearDown();
	}

}
