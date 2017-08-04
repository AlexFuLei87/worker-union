/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhProductCapacityItemExistException extends Exception {

	public WhProductCapacityItemExistException() {
		super();
	}

	public WhProductCapacityItemExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhProductCapacityItemExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhProductCapacityItemExistException(String message) {
		super(message);
	}

	public WhProductCapacityItemExistException(Throwable cause) {
		super(cause);
	}


}
