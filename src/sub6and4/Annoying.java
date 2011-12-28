package sub6and4;

import java.util.Collection;

public class Annoying {
	public static <T> T[] toArray(Collection<T> c) {
		T[] a = new T[c.size()]; // compile-time error
		int i=0; for (T x : c) a[i++] = x;
		return a;
	}
}
