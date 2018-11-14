package algorith;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TrappingWaterAlgorithmBruteForceTest {

	private static TrappingWaterAlgorithm TrappingWaterAlgorithm;

	@BeforeClass public static void init() {
		TrappingWaterAlgorithm = new TrappingWaterAlgorithmBruteForce();
	}

	@Test public void isClassThere() {
		Assert.assertNotNull(TrappingWaterAlgorithm);
	}

	@Test public void doesEmpyArrayReturnZero() {
		int[] data = {};
		int result = TrappingWaterAlgorithm.processData(data);
		Assert.assertEquals(0, result);
	}

	@Test public void testCaseOneElementWithZeroElevarion() {
		int[] data = { 0 };
		int result = TrappingWaterAlgorithm.processData(data);
		Assert.assertEquals(0, result);
	}

	@Test public void testCaseTwoElementWithSomeElevationAreNotAbleToTrapWater() {
		int[] data = { 2, 2 };
		int result = TrappingWaterAlgorithm.processData(data);
		Assert.assertEquals(0, result);
	}

	@Test public void testCaseThreeElementAllEqualsEachOtherAndNotWaterThere() {
		int[] data = { 2, 2, 2 };
		int result = TrappingWaterAlgorithm.processData(data);
		Assert.assertEquals(0, result);
	}

	@Test public void testCaseThreeElementAndShouldBeSomeWaterOnTheMiddle() {
		int[] data = { 2, 0, 2 };
		int result = TrappingWaterAlgorithm.processData(data);
		Assert.assertNotEquals(0, result);
	}

	@Test public void testCaseThreeElementAndShouldBeTwoUnitOfWaterOnTheMiddle() {
		int[] data = { 2, 0, 2 };
		int result = TrappingWaterAlgorithm.processData(data);
		Assert.assertEquals(2, result);
	}

	@Test public void threeElementAllZero() {
		int[] data = { 0, 0, 0 };
		int result = TrappingWaterAlgorithm.processData(data);
		Assert.assertEquals(0, result);
	}

	@Test public void threeElementLastOneIsNotZero() {
		int[] data = { 0, 0, 1 };
		int result = TrappingWaterAlgorithm.processData(data);
		Assert.assertEquals(0, result);
	}

	@Test public void threeElementMiddleOneIsNotZero() {
		int[] data = { 0, 1, 0 };
		int result = TrappingWaterAlgorithm.processData(data);
		Assert.assertEquals(0, result);
	}

	@Test public void threeElementTwoAndThirdAreNotZero() {
		int[] data = { 0, 1, 1 };
		int result = TrappingWaterAlgorithm.processData(data);
		Assert.assertEquals(0, result);
	}

	@Test public void threeElementFistOneIsNotZero() {
		int[] data = { 1, 0, 0 };
		int result = TrappingWaterAlgorithm.processData(data);
		Assert.assertEquals(0, result);
	}

	@Test public void threeElementFistOneAndSecondAreNotZero() {
		int[] data = { 1, 1, 0 };
		int result = TrappingWaterAlgorithm.processData(data);
		Assert.assertEquals(0, result);
	}

	@Test public void checkValuesForValidTrappingWhaterCaseOfThreeElementsFirstSmaller() {
		int[] data = { 1, 0, 2 };
		int result = TrappingWaterAlgorithm.processData(data);
		Assert.assertEquals(1, result);
	}


	@Test public void checkValuesForValidTrappingWhaterCaseOfThreeElementsLastSmaller() {
		int[] data = { 8, 0, 3 };
		int result = TrappingWaterAlgorithm.processData(data);
		Assert.assertEquals(3, result);
	}


	@Test public void caseTestIntegrationTestCase1() {
			int[] data = {0,1,0,2,1,0,1,3,2,1,2,1};
			int result = TrappingWaterAlgorithm.processData(data);
			Assert.assertEquals(6,result);
		}

	@Test public void caseTestIntegrationTestCase2() {
		int[] data = {3, 0, 0, 2, 0, 4};
		int result = TrappingWaterAlgorithm.processData(data);
		Assert.assertEquals(10,result);
	}

	@Test public void caseTestIntegrationTestCase3() {
		int[] data = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int result = TrappingWaterAlgorithm.processData(data);
		Assert.assertEquals(6,result);
	}
}
