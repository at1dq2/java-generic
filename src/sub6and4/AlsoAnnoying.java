package sub6and4;

import java.util.Arrays;
import java.util.List;

public class AlsoAnnoying {
	public static List<Integer>[] twoLists() {
		List<Integer> a = Arrays.asList(1,2,3);
		List<Integer> b = Arrays.asList(4,5,6);
		return new List<Integer>[] {a, b}; // compile-time error
	}
}
