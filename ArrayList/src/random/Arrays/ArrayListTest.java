package random.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(1);
		nums.add(2);
		
		int[] numSources = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		List<Integer> nums2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	}

}
