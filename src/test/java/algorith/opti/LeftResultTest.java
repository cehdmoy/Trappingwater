package algorith.opti;

import org.junit.Assert;
import org.junit.Test;

public class LeftResultTest {

	@Test public void getTallestFromLeftSideTestEmpty() {
		int[] data = {};
		int[] result = processData(data);
		Assert.assertEquals(0,result.length);
	}

	private int[] processData(int[] data) {
		return new int[0];
	}
}
