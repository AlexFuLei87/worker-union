/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidIDCardException extends Exception {

	public WhInvalidIDCardException() {
		super();
	}

	public WhInvalidIDCardException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidIDCardException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidIDCardException(String message) {
		super(message);
	}

	public WhInvalidIDCardException(Throwable cause) {
		super(cause);
	}


}
