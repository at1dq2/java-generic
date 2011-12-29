package sub6and6;

import java.util.Arrays;
import java.util.List;

public class InnocentClient {
	public static void main(String[] args) {
		List<Integer>[] intLists = DeceptiveLibrary.intLists(1);
		List<? extends Number>[] numLists = intLists;
		numLists[0] = Arrays.asList(1.01);
		int i = intLists[0].get(0); // class cast error!
	}
}
