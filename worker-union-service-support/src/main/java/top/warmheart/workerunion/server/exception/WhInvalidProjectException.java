/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidProjectException extends Exception {

	public WhInvalidProjectException() {
		super();
	}

	public WhInvalidProjectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidProjectException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidProjectException(String message) {
		super(message);
	}

	public WhInvalidProjectException(Throwable cause) {
		super(cause);
	}


}
