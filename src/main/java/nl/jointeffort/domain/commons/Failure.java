package nl.jointeffort.domain.commons;


public class Failure<T> implements DomainResult<T> {

	private String key;
	
	public Failure(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
	
	@Override
	public boolean isSuccess() {
		return false;
	}

	@Override
	public Success<T> asSuccess() {
		throw new IllegalStateException("Failure can never be a success...");
	}

	@Override
	public Failure<T> asFailure() {
		return this;
	}

	public static <T> Failure<T> with(String messageKey) {
		return new Failure<T>(messageKey);
	}
}
