/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhContractDeletedException extends Exception {

	public WhContractDeletedException() {
		super();
	}

	public WhContractDeletedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhContractDeletedException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhContractDeletedException(String message) {
		super(message);
	}

	public WhContractDeletedException(Throwable cause) {
		super(cause);
	}


}
