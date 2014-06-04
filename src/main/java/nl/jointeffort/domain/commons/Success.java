package nl.jointeffort.domain.commons;

public class Success<T> implements DomainResult<T> {

	private T result;
	
	public Success(T result) {
		this.result = result;
	}
	
	public T getResult() {
		return result;
	}

	@Override
	public boolean isSuccess() {
		return true;
	}

	@Override
	public Success<T> asSuccess() {
		return this;
	}

	@Override
	public Failure<T> asFailure() {
		throw new IllegalStateException("Success can never be a failure...");
	}
	
	public static <T> Success<T> with(T t) {
		return new Success<T>(t);
	}
}
