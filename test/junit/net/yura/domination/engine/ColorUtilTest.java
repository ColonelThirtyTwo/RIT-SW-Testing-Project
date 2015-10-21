
package net.yura.domination.engine;

import junit.framework.TestCase;

public class ColorUtilTest extends TestCase {
	public ColorUtilTest(String testName) {
		super(testName);
	}

	public void testGetStringForColor() {
		assertEquals("black", ColorUtil.getStringForColor(ColorUtil.BLACK));
		assertEquals("blue", ColorUtil.getStringForColor(ColorUtil.BLUE));
		assertEquals("cyan", ColorUtil.getStringForColor(ColorUtil.CYAN));
		assertEquals("blue", ColorUtil.getStringForColor(ColorUtil.BLUE));
		assertEquals("darkgray", ColorUtil.getStringForColor(ColorUtil.DARK_GRAY));
		assertEquals("gray", ColorUtil.getStringForColor(ColorUtil.GRAY));
		assertEquals("green", ColorUtil.getStringForColor(ColorUtil.GREEN));
		assertEquals("lightgray", ColorUtil.getStringForColor(ColorUtil.LIGHT_GRAY));
		assertEquals("magenta", ColorUtil.getStringForColor(ColorUtil.MAGENTA));
		assertEquals("orange", ColorUtil.getStringForColor(ColorUtil.ORANGE));
		assertEquals("pink", ColorUtil.getStringForColor(ColorUtil.PINK));
		assertEquals("red", ColorUtil.getStringForColor(ColorUtil.RED));
		assertEquals("white", ColorUtil.getStringForColor(ColorUtil.WHITE));
		assertEquals("yellow", ColorUtil.getStringForColor(ColorUtil.YELLOW));
		
		assertEquals("#deadbf", ColorUtil.getStringForColor(0xdeadbf));
	}

	public void testGetColor() {
		assertEquals(ColorUtil.BLACK, ColorUtil.getColor("black"));
		assertEquals(ColorUtil.BLUE, ColorUtil.getColor("blue"));
		assertEquals(ColorUtil.CYAN, ColorUtil.getColor("cyan"));
		assertEquals(ColorUtil.BLUE, ColorUtil.getColor("blue"));
		assertEquals(ColorUtil.DARK_GRAY, ColorUtil.getColor("darkgray"));
		assertEquals(ColorUtil.GRAY, ColorUtil.getColor("gray"));
		assertEquals(ColorUtil.GREEN, ColorUtil.getColor("green"));
		assertEquals(ColorUtil.LIGHT_GRAY, ColorUtil.getColor("lightgray"));
		assertEquals(ColorUtil.MAGENTA, ColorUtil.getColor("magenta"));
		assertEquals(ColorUtil.ORANGE, ColorUtil.getColor("orange"));
		assertEquals(ColorUtil.PINK, ColorUtil.getColor("pink"));
		assertEquals(ColorUtil.RED, ColorUtil.getColor("red"));
		assertEquals(ColorUtil.WHITE, ColorUtil.getColor("white"));
		assertEquals(ColorUtil.YELLOW, ColorUtil.getColor("yellow"));
		
		assertEquals(0xffdeadbf, ColorUtil.getColor("#deadbf"));
		
	}

	public void testGetTextColorFor() {
		assertEquals(ColorUtil.WHITE, ColorUtil.getTextColorFor(ColorUtil.BLACK));
		assertEquals(ColorUtil.BLACK, ColorUtil.getTextColorFor(ColorUtil.WHITE));
		
		assertEquals(ColorUtil.BLACK, ColorUtil.getTextColorFor(0xff0000));
		assertEquals(ColorUtil.BLACK, ColorUtil.getTextColorFor(0x00ff00));
		assertEquals(ColorUtil.BLACK, ColorUtil.getTextColorFor(0x979711));
		assertEquals(ColorUtil.BLACK, ColorUtil.getTextColorFor(0x9797ff));
		
		assertEquals(ColorUtil.WHITE, ColorUtil.getTextColorFor(0xaa0000));
		assertEquals(ColorUtil.WHITE, ColorUtil.getTextColorFor(0x00aa00));
		assertEquals(ColorUtil.WHITE, ColorUtil.getTextColorFor(0x909011));
		assertEquals(ColorUtil.WHITE, ColorUtil.getTextColorFor(0x9090ff));
	}

	public void testGetRed() {
		assertEquals(0x00, ColorUtil.getRed(0x000000));
		assertEquals(0x00, ColorUtil.getRed(0x00ffff));
		assertEquals(0x45, ColorUtil.getRed(0x454647));
		assertEquals(0xff, ColorUtil.getRed(0xffaabb));
	}

	public void testGetGreen() {
		assertEquals(0x00, ColorUtil.getGreen(0x000000));
		assertEquals(0x00, ColorUtil.getGreen(0xff00ff));
		assertEquals(0x46, ColorUtil.getGreen(0x454647));
		assertEquals(0xaa, ColorUtil.getGreen(0xffaabb));
	}

	public void testGetBlue() {
		assertEquals(0x00, ColorUtil.getBlue(0x000000));
		assertEquals(0x00, ColorUtil.getBlue(0xffff00));
		assertEquals(0x47, ColorUtil.getBlue(0x454647));
		assertEquals(0xbb, ColorUtil.getBlue(0xffaabb));
	}

	public void testGetAlpha() {
		assertEquals(0x00, ColorUtil.getAlpha(0x000000));
		assertEquals(0x00, ColorUtil.getAlpha(0xffff00));
		assertEquals(0x00, ColorUtil.getAlpha(0x454647));
		assertEquals(0x00, ColorUtil.getAlpha(0xffaabb));
		
		assertEquals(0xff, ColorUtil.getAlpha(0xff000000));
		assertEquals(0xbb, ColorUtil.getAlpha(0xbbffff00));
		assertEquals(0xcc, ColorUtil.getAlpha(0xcc454647));
		assertEquals(0x99, ColorUtil.getAlpha(0x99ffaabb));
	}

	public void testGetHexForColor() {
		assertEquals("#000000", ColorUtil.getHexForColor(ColorUtil.BLACK));
		assertEquals("#ff0000", ColorUtil.getHexForColor(ColorUtil.RED));
		assertEquals("#deadbf", ColorUtil.getHexForColor(0xdeadbf));
	}
	
}
