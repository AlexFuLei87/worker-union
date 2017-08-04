/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidTargetException extends Exception {

	public WhInvalidTargetException() {
		super();
	}

	public WhInvalidTargetException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidTargetException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidTargetException(String message) {
		super(message);
	}

	public WhInvalidTargetException(Throwable cause) {
		super(cause);
	}


}
