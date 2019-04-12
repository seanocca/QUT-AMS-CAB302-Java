package junit.FootyScore;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FootyScoreTests {

	private int goals = 0;
	private int behinds = 0;
	
	FootyScore teamOne;
	
	@Before
	public void setUp(){
		teamOne = new FootyScore();
	}


	@Test
	public void testKickGoal() {
		int expectedPoints = 6;
		teamOne.kickGoal();
		int actualPoints = teamOne.getPoints();
		assertEquals(expectedPoints, actualPoints);
	}

	@Test
	public void testKickBehind() {
		int expectedPoints = 1;
		teamOne.kickBehind();
		int actualPoints = teamOne.getPoints();
		assertEquals(expectedPoints, actualPoints);
	}

	@Test
	public void testGetPoints() {
		//Get what is expected;
		int expectedPoints = goals * 6 + behinds * 1;
		
		//Get the created result
		int actualPoints = teamOne.getPoints();

		//Check the result with a proper answer
		assertEquals(expectedPoints,actualPoints);
	}

	@Test
	public void testSayScore() {
		//Get what is Expected
		String expectedValue = goals + ", " + behinds + ", " + "0";		
		
		//Get the Stringed Result
		String actualValue = teamOne.sayScore();

		//Check answer
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testInFrontOf() {
		//Create Another team to test with
		FootyScore teamTwo = new FootyScore();

		//Ask the question
		boolean actualBoolean = teamOne.inFrontOf(teamTwo);
		
		//Get Expected
		boolean expectedBoolean = teamOne.getPoints() > teamTwo.getPoints();

		//Check the results
		assertEquals(expectedBoolean, actualBoolean);

	}
}

