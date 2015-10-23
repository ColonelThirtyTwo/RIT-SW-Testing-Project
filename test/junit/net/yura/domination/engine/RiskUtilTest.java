
package net.yura.domination.engine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import junit.framework.TestCase;
import net.yura.domination.engine.core.RiskGame;

public class RiskUtilTest extends TestCase {
	public RiskUtilTest(String testName) {
		super(testName);
	}
	
	public void testCreateGameString() {
		assertEquals("2\n1\n3\nchoosemap best.map\nstartgame domination increasing",
			RiskUtil.createGameString(
				1,2,3,
				RiskGame.MODE_DOMINATION,
				RiskGame.CARD_INCREASING_SET,
				false, false,
				"best.map"
		));
		
		assertEquals("1\n5\n7\nchoosemap worst.map\nstartgame capital fixed autoplaceall recycle",
			RiskUtil.createGameString(
				5,1,7,
				RiskGame.MODE_CAPITAL,
				RiskGame.CARD_FIXED_SET,
				true, true,
				"worst.map"
		));
	}
	
	public void testQuote() {
		assertEquals(Pattern.quote(""), RiskUtil.quote(""));
		assertEquals(Pattern.quote("hello world"), RiskUtil.quote("hello world"));
		assertEquals(Pattern.quote("[]*&\\^!@$"), RiskUtil.quote("[]*&\\^!@$"));
		assertEquals(Pattern.quote("hello\\Eworld!"), RiskUtil.quote("hello\\Eworld!"));
		assertEquals(Pattern.quote("this\\Eis\\Ea\\Et[es]t"), RiskUtil.quote("this\\Eis\\Ea\\Et[es]t"));
	}
	
	public void testQuoteReplacement() {
		assertEquals(Matcher.quoteReplacement(""), RiskUtil.quoteReplacement(""));
		assertEquals(Matcher.quoteReplacement("hello world"), RiskUtil.quoteReplacement("hello world"));
		assertEquals(Matcher.quoteReplacement("[]*&\\^!@$"), RiskUtil.quoteReplacement("[]*&\\^!@$"));
		assertEquals(Matcher.quoteReplacement("this$is$a$test"), RiskUtil.quoteReplacement("this$is$a$test"));
	}
	
	/*
	public void testOpenMapStream() throws Exception {
	}

	public void testOpenStream() throws Exception {
	}

	public void testGetResourceBundle() {
	}

	public void testOpenURL() throws Exception {
	}

	public void testOpenDocs() throws Exception {
	}

	public void testSaveFile() throws Exception {
	}

	public void testGetLoadFileInputStream() throws Exception {
	}

	public void testGetMapNameFromLobbyStartGameOption() {
	}

	public void testGetGameDescriptionFromLobbyStartGameOption() {
	}

	public void testPrintStackTrace() {
	}

	public void testDonate() throws Exception {
	}

	public void testDonatePayPal() throws Exception {
	}

	public void testGetPlayerSettings() {
	}

	public void testLoadPlayers() {
	}

	public void testSavePlayers_Risk_Class() {
	}

	public void testSavePlayers_List_Class() {
	}

	public void testReadMap() throws Exception {
	}

	public void testLoadInfo() {
	}

	public void testSaveGameLog() throws Exception {
	}

	public void testGetOutputStream() throws Exception {
	}

	public void testRename() {
	}

	public void testAsVector() {
	}

	public void testAsHashtable() {
	}

	public void testReplaceAll() {
	}

	public void testCopy() throws Exception {
	}

	public void testGetAtLeastOne() {
	}
	*/
}
