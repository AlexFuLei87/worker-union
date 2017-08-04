/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidProductCapacityItemException extends Exception {

	public WhInvalidProductCapacityItemException() {
		super();
	}

	public WhInvalidProductCapacityItemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidProductCapacityItemException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidProductCapacityItemException(String message) {
		super(message);
	}

	public WhInvalidProductCapacityItemException(Throwable cause) {
		super(cause);
	}


}
