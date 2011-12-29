package sub6and6;

import java.util.Arrays;
import java.util.List;

public class DeceptiveLibrary {
	public static List<Integer>[] intLists(int size) {
		List<Integer>[] intLists = (List<Integer>[]) new List[size]; // unchecked
																		// cast
		for (int i = 0; i < size; i++)
			intLists[i] = Arrays.asList(i + 1);
		return intLists;
	}
}
