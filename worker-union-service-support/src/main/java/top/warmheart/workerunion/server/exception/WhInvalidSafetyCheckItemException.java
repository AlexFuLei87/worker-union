/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidSafetyCheckItemException extends Exception {

	public WhInvalidSafetyCheckItemException() {
		super();
	}

	public WhInvalidSafetyCheckItemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidSafetyCheckItemException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidSafetyCheckItemException(String message) {
		super(message);
	}

	public WhInvalidSafetyCheckItemException(Throwable cause) {
		super(cause);
	}


}
