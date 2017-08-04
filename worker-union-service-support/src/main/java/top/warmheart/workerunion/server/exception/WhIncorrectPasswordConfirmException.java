/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhIncorrectPasswordConfirmException extends Exception {

	public WhIncorrectPasswordConfirmException() {
		super();
	}

	public WhIncorrectPasswordConfirmException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhIncorrectPasswordConfirmException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhIncorrectPasswordConfirmException(String message) {
		super(message);
	}

	public WhIncorrectPasswordConfirmException(Throwable cause) {
		super(cause);
	}


}
