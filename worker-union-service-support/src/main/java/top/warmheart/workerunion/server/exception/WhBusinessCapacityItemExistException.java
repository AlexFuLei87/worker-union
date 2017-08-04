/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhBusinessCapacityItemExistException extends Exception {

	public WhBusinessCapacityItemExistException() {
		super();
	}

	public WhBusinessCapacityItemExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhBusinessCapacityItemExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhBusinessCapacityItemExistException(String message) {
		super(message);
	}

	public WhBusinessCapacityItemExistException(Throwable cause) {
		super(cause);
	}


}
