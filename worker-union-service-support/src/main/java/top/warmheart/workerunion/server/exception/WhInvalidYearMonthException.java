/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidYearMonthException extends Exception {

	public WhInvalidYearMonthException() {
		super();
	}

	public WhInvalidYearMonthException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidYearMonthException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidYearMonthException(String message) {
		super(message);
	}

	public WhInvalidYearMonthException(Throwable cause) {
		super(cause);
	}


}
