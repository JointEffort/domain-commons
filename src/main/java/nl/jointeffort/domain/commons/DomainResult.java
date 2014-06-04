package nl.jointeffort.domain.commons;

public interface DomainResult<T> {

	boolean isSuccess();
	
	Success<T> asSuccess();
	
	Failure<T> asFailure();
}
