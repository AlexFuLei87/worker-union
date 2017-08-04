/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidProjectApplicationException extends Exception {

	public WhInvalidProjectApplicationException() {
		super();
	}

	public WhInvalidProjectApplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidProjectApplicationException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidProjectApplicationException(String message) {
		super(message);
	}

	public WhInvalidProjectApplicationException(Throwable cause) {
		super(cause);
	}


}
