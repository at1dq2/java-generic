package sub6and5;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ErasureWrong {
	public static Object[] toArray(Collection c) {
		Object[] a = (Object[]) new Object[c.size()]; // unchecked cast
		int i = 0;
		for (Object x : c)
			a[i++] = x;
		return a;
	}

	public static void main(String[] args) {
		List strings = Arrays.asList(args);
		String[] a = (String[]) toArray(strings); // class cast error
	}
}
