
package net.yura.domination.engine;

import static org.easymock.EasyMock.*;
import org.easymock.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class RiskControllerTest extends EasyMockSupport {
	
	private RiskController controller;
	private RiskListener listener;
	
	@Before
	public void setUp() {
		listener = mock(RiskListener.class);
		controller = new RiskController();
		controller.addListener(listener);
	}
	
	@After
	public void tearDown() {
		controller = null;
	}
	
	@Test
	public void testAddListenerNull() {
		try {
			controller.addListener(null);
			fail("addListener(null) succeeded when it should have failed.");
		} catch(NullPointerException e) {
		}
	}
	
	public void testSendMessage() {
		listener.sendMessage("asdfstring", true, false);
		replayAll();
		controller.sendMessage("asdfstring", true, false);
		verifyAll();
	}
	
	/*
	public void testAddListener() {
	}

	public void testCountListeners() {
	}

	public void testDeleteListener() {
	}

	

	public void testNeedInput() {
	}

	public void testNoInput() {
	}

	public void testSetGameStatus() {
	}

	public void testNewGame() {
	}

	public void testStartGame() {
	}

	public void testCloseGame() {
	}

	public void testShowMapPic() {
	}

	public void testShowCardsFile() {
	}

	public void testServerState() {
	}

	public void testOpenBattle() {
	}

	public void testCloseBattle() {
	}

	public void testAddPlayer() {
	}

	public void testDelPlayer() {
	}

	public void testShowDiceResults() {
	}

	public void testSetNODAttacker() {
	}

	public void testSetNODDefender() {
	}

	public void testSendDebug() {
	}

	public void testShowMessageDialog() {
	}
	*/
}
