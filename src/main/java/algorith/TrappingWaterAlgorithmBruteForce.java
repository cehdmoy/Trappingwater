package algorith;

public class TrappingWaterAlgorithmBruteForce implements TrappingWaterAlgorithm{

	public int processData(int[] heightArray) {
		if (heightArray.length < 3)
			return 0;
		else {

			int index=0;

			int result=0;

			for (int currentHeiht : heightArray) {

				int leftTallest = getLeftTaller(heightArray, index);

				int rightTallest = getRightTaller(heightArray, index);

				if (shouldCalculateWaterInThere(currentHeiht, leftTallest, rightTallest)) {
					int min = determinateMin(leftTallest, rightTallest);

					result+=min-currentHeiht;
				}

				index++;
			}
			return result;
		}
	}

	private int determinateMin(int leftTaller, int rightTaller) {
		return leftTaller>rightTaller?rightTaller:leftTaller;
	}

	private boolean shouldCalculateWaterInThere(int colum, int leftTaller, int rightTaller) {
		return colum<leftTaller && colum<rightTaller && leftTaller != 0 && rightTaller != 0;
	}

	private int getRightTaller(int[] data, int index) {
		int rightTaller=0;
		for(int i=index;i<data.length;i++)
		{
			if(data[i]>rightTaller)
			{
				rightTaller=data[i];
			}
		}
		return rightTaller;
	}

	private int getLeftTaller(int[] data, int index) {
		int leftTaller=0;

		for(int i=index-1;i>=0;i--)
		{
			if(data[i]>leftTaller)
			{
				leftTaller=data[i];
			}
		}
		return leftTaller;
	}
}
