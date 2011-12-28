package sub6and3;

public class ParametricException<T> extends Exception {
	private final T value;

	public ParametricException(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

}
