/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhBusinessCapacityItemCheckedException extends Exception {

	public WhBusinessCapacityItemCheckedException() {
		super();
	}

	public WhBusinessCapacityItemCheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhBusinessCapacityItemCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhBusinessCapacityItemCheckedException(String message) {
		super(message);
	}

	public WhBusinessCapacityItemCheckedException(Throwable cause) {
		super(cause);
	}


}
