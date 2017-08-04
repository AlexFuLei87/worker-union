/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhContractExistException extends Exception {

	public WhContractExistException() {
		super();
	}

	public WhContractExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhContractExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhContractExistException(String message) {
		super(message);
	}

	public WhContractExistException(Throwable cause) {
		super(cause);
	}


}
