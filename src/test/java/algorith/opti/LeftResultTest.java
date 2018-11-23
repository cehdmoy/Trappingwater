package algorith.opti;

import org.junit.Assert;
import org.junit.Test;

public class LeftResultTest {

	@Test public void getTallestFromLeftSideTestEmpty() {
		int[] data = {};
		int[] result = processData(data);
		Assert.assertEquals(0,result.length);
	}

	@Test
	public void gienDataWithJustOneElementWillReturnAnArrayWithSameElement() {
		int[] data = {55};
		int[] result = processData(data);
		Assert.assertEquals(1,result.length);
		Assert.assertEquals(55,result[0]);
	}

	private int[] processData(int[] data)
	{
		int[] result = new int[data.length];
		if(result.length>0)
		result[0]=data[0];
		return result;
	}
}
